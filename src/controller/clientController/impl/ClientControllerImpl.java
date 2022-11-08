package controller.clientController.impl;

import controller.clientController.ClientController;
import controller.clientController.adapter.ClientControllerParser;
import dao.clientRepository.impl.ClientRepositoryImpl;
import dao.vehicleRespository.VehicleRepository;
import model.db.ClientDao;
import model.db.VehicleDao;
import model.dto.Client;

import java.sql.SQLException;
import java.util.List;

public class ClientControllerImpl implements ClientController {
    private ClientRepositoryImpl clientRepository;
    private VehicleRepository vehicleRepository;

    public ClientControllerImpl(ClientRepositoryImpl clientRepository,
                                VehicleRepository vehicleRepository) {
        this.clientRepository = clientRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Client findClientByDocument(String documentNumber) {
        try {
            final ClientDao client = clientRepository.getClientByDocumentNumber(documentNumber);
            final List<VehicleDao> vehicles = vehicleRepository.getVehicleByClient(client.getClientNumber());

            return ClientControllerParser.convertClientDaoToDTO(client, vehicles);

        } catch (SQLException | ClassNotFoundException ex) {
            ;
        }
        return null;
    }
}
