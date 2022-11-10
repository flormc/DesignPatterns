package dao.clientRepository.impl;

import dao.ConnectionFacadeImpl;
import dao.clientRepository.ClientRepository;
import exception.ResourceNotFoundException;
import model.db.ClientDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ClientRepositoryImpl implements ClientRepository {

    public static final String BY_DOCUMENT = "SELECT * FROM client c WHERE c.document_number = ?";
    public static final String CREATE_CLIENT_INSERT = "INSERT INTO client VALUES (?, ?, ?, ?, ?)";
    private ConnectionFacadeImpl connectionFacade;

    public ClientRepositoryImpl(ConnectionFacadeImpl connectionFacade) {
        this.connectionFacade = connectionFacade;
    }

    @Override
    public ClientDao getClientByDocumentNumber(String documentNumber) throws SQLException, ClassNotFoundException,
            ResourceNotFoundException {
        final Connection connection = connectionFacade.startConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(BY_DOCUMENT);
        preparedStatement.setString(1, documentNumber);

        ResultSet rs = preparedStatement.executeQuery();


        return Optional.ofNullable(fillDao(rs))
                .get().orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public void createClient(ClientDao clientDao) throws SQLException, ClassNotFoundException {
        final Connection connection = connectionFacade.startConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE_CLIENT_INSERT);
        preparedStatement.setString(2, clientDao.getName());
        preparedStatement.setString(3, clientDao.getLastName());
        preparedStatement.setInt(4, clientDao.getDocumentType());
        preparedStatement.setString(5, clientDao.getDocumentNumber());

        preparedStatement.executeUpdate();
    }

    private Optional<ClientDao> fillDao(ResultSet rs) throws SQLException {
        ClientDao client = null;
        while (rs.next()) {
            client = new ClientDao();
            client.setClientNumber(rs.getInt("cod_cliente"));
            client.setName(rs.getString("name"));
            client.setLastName(rs.getString("last_name"));
            client.setDocumentType(rs.getInt("document_type"));
            client.setDocumentNumber(rs.getString("document_number"));
        }

        return Optional.ofNullable(client);
    }
}
