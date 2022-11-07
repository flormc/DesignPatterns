package controller.clientController.impl;

import controller.clientController.ClientController;
import controller.clientController.adapter.ClientControllerParser;
import dao.clientRepository.impl.ClientRepositoryImpl;
import model.db.ClientDao;
import model.dto.Client;

import java.sql.SQLException;

public class ClientControllerImpl implements ClientController {
    private ClientRepositoryImpl clientRepository;

    public ClientControllerImpl(ClientRepositoryImpl clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findClientByDocument(String documentNumber) {
        try {
            final ClientDao clientByDocumentNumber = clientRepository.getClientByDocumentNumber(documentNumber);

            return ClientControllerParser.convertClientDaoToDTO(clientByDocumentNumber);

        } catch (SQLException | ClassNotFoundException ex) {
            ;
        }
        return null;
    }
}
