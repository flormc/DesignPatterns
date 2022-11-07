package controller.clientController.adapter;

import model.db.ClientDao;
import model.dto.Client;
import model.dto.DocumentType;

public class ClientControllerParser {

    public static Client convertClientDaoToDTO(ClientDao clientDao) {
        Client client = new Client();
        client.setClientNumber(clientDao.getClientNumber());
        client.setDocumentNumber(clientDao.getDocumentNumber());
        client.setDocumentType(DocumentType.getEnum(clientDao.getDocumentType()));
        client.setName(clientDao.getName());
        client.setLastName(clientDao.getLastName());

        return client;
    }
}
