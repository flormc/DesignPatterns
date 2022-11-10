package controller.clientController.impl;

import controller.clientController.ClientController;
import controller.clientController.adapter.ClientControllerParser;
import controller.clientController.adapter.VehicleControllerParser;
import dao.clientRepository.impl.ClientRepositoryImpl;
import dao.turnRepository.impl.TurnRepositoryImpl;
import dao.vehicleRespository.VehicleRepository;
import exception.ResourceNotFoundException;
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
        this.turnRepository = turnRepository;
    }

    @Override
    public Client findClientByDocument(String documentNumber) throws ResourceNotFoundException {
        try {
            final ClientDao client = clientRepository.getClientByDocumentNumber(documentNumber);
            final List<VehicleDao> vehicles = vehicleRepository.getVehicleByClient(client.getClientNumber());
            final List<TurnDao> tuns = turnRepository.getAllTurnByClient(client.getClientNumber());

            return ClientControllerParser.convertClientDaoToDTO(client, vehicles, tuns);

        } catch (SQLException | ClassNotFoundException ex) {
            throw new ResourceNotFoundException();
        }
    }

    @Override
    public Client createClient(Client client) throws SQLException, ClassNotFoundException {
        clientRepository.createClient(
                ClientControllerParser.convertClientDTODaoDaoToDao(client));

        final Client createClient = ClientControllerParser.convertClientDaoDaoToDTO(
                clientRepository.getClientByDocumentNumber(client.getDocumentNumber()));

        this.vehicleRepository.createVehicleByClient(
                VehicleControllerParser.convertVehicleDTOToDao(client.getVehicleList().get(0)),
                createClient.getClientNumber());

        return createClient;
    }
}
