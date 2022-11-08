package controller.clientController.adapter;

import model.db.ClientDao;
import model.db.TurnDao;
import model.db.VehicleDao;
import model.dto.Client;
import model.dto.DocumentType;

import java.util.List;

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
}
