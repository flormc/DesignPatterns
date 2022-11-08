package dao.clientRepository.impl;

import dao.ConnectionFacadeImpl;
import dao.clientRepository.ClientRepository;
import model.db.ClientDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ClientRepositoryImpl implements ClientRepository {

    public static final String BY_DOCUMENT = "SELECT * FROM client c WHERE c.document_number = ?";
    private ConnectionFacadeImpl connectionFacade;

    public ClientRepositoryImpl(ConnectionFacadeImpl connectionFacade) {
        this.connectionFacade = connectionFacade;
    }

    @Override
    public ClientDao getClientByDocumentNumber(String documentNumber) throws SQLException, ClassNotFoundException {
        final Connection connection = connectionFacade.startConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(BY_DOCUMENT);
        preparedStatement.setString(1, documentNumber);

        ResultSet rs = preparedStatement.executeQuery();

        return Optional.ofNullable(fillDao(rs))
                .get().orElseThrow(RuntimeException::new);
    }

    private Optional<ClientDao> fillDao(ResultSet rs) throws SQLException {
        ClientDao client = null;
        while(rs.next()) {
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
