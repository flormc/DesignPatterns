package controller.clientController.adapter;

import model.db.ClientDao;
import model.db.ClientDaoBuilder;
import model.db.TurnDao;
import model.db.VehicleDao;
import model.dto.Client;
import model.dto.ClientBuilder;
import model.dto.DocumentType;

import java.util.List;
import java.util.stream.Collectors;

public class ClientControllerParser {

    public static Client convertClientDaoToDTO(ClientDao clientDao, List<VehicleDao> vehicleDaos,
                                               List<TurnDao> tuns) {
        Client client = new Client();

        client.setClientNumber(clientDao.getClientNumber());
        client.setDocumentNumber(clientDao.getDocumentNumber());
        client.setDocumentType(DocumentType.getEnum(clientDao.getDocumentType()));
        client.setName(clientDao.getName());
        client.setLastName(clientDao.getLastName());
        client.setVehicleList(VehicleControllerParser.convertListVehicleDaoToDTO(vehicleDaos));
        client.setTurns(TurnControllerParser.convertListVehicleDaoToDTO(tuns));

        return client;
    }

    public static Client convertClientDaoDaoToDTO(ClientDao clientDao) {
        return ClientBuilder.aClient()
                .withClientNumber(clientDao.getClientNumber())
                .withDocumentType(DocumentType.getEnum(clientDao.getDocumentType()))
                .withDocumentNumber(clientDao.getDocumentNumber())
                .withLastName(clientDao.getLastName())
                .withName(clientDao.getName())
                .build();

    }

    public static ClientDao convertClientDTODaoDaoToDao(Client client) {
        return ClientDaoBuilder.aClientDao()
                .withClientNumber((int) client.getClientNumber())
                .withDocumentType(client.getDocumentType().getCode())
                .withDocumentNumber(client.getDocumentNumber())
                .withLastName(client.getLastName())
                .withName(client.getName())
                .withVehicleDaos(client.getVehicleList().stream()
                        .map(VehicleControllerParser::convertVehicleDTOToDao)
                        .collect(Collectors.toList()))
                .build();

    }
}
