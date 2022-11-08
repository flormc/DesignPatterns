package controller.clientController.impl;

import controller.clientController.ClientController;
import controller.clientController.adapter.ClientControllerParser;
import dao.clientRepository.impl.ClientRepositoryImpl;
import dao.turnRepository.impl.TurnRepositoryImpl;
import dao.vehicleRespository.VehicleRepository;
import model.db.ClientDao;
import model.db.TurnDao;
import model.db.VehicleDao;
import model.dto.Client;

import java.sql.SQLException;
import java.util.List;

public class ClientControllerImpl implements ClientController {
    private ClientRepositoryImpl clientRepository;
    private VehicleRepository vehicleRepository;
    private TurnRepositoryImpl turnRepository;

    public ClientControllerImpl(ClientRepositoryImpl clientRepository,
                                VehicleRepository vehicleRepository,
                                TurnRepositoryImpl turnRepository) {
        this.clientRepository = clientRepository;
        this.vehicleRepository = vehicleRepository;
        this.turnRepository  = turnRepository;
    }

    @Override
    public Client findClientByDocument(String documentNumber) {
        try {
            final ClientDao client = clientRepository.getClientByDocumentNumber(documentNumber);
            final List<VehicleDao> vehicles = vehicleRepository.getVehicleByClient(client.getClientNumber());
            final List<TurnDao> tuns = turnRepository.getAllTurnByClient(client.getClientNumber());

            return ClientControllerParser.convertClientDaoToDTO(client, vehicles, tuns);

        } catch (SQLException | ClassNotFoundException ex) {
            ;
        }
        return null;
    }
}
