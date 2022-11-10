package controller.clientController;

import exception.ResourceNotFoundException;
import model.dto.Client;

import java.sql.SQLException;

public interface ClientController {

    Client findClientByDocument(String documentNumber) throws SQLException, ClassNotFoundException, ResourceNotFoundException;

    Client createClient(Client client) throws SQLException, ClassNotFoundException;
}
