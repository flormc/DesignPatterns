package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionFacade {

    Connection startConnection() throws ClassNotFoundException, SQLException;

    void closeConnection(final Connection connection) throws SQLException;
}
