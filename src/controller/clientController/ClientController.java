package controller.clientController;

import model.dto.Client;

import java.sql.SQLException;

public interface ClientController {
    Client findClientByDocument(String documentNumber) throws SQLException, ClassNotFoundException;
}
