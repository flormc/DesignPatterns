package dao.clientRepository;

import model.db.ClientDao;

import java.sql.SQLException;

public interface ClientRepository {

    ClientDao getClientByDocumentNumber(String documentNumber) throws SQLException, ClassNotFoundException;

    void createClient(ClientDao clientDao) throws SQLException, ClassNotFoundException;
}
