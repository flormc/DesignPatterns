package dao;

import config.SchedulerDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFacadeImpl implements ConnectionFacade {
    private SchedulerDB schedulerDB;

    public ConnectionFacadeImpl(SchedulerDB schedulerDB) {
        this.schedulerDB = schedulerDB;
    }

    @Override
    public Connection startConnection() throws ClassNotFoundException, SQLException {
        Class.forName(schedulerDB.getStringConnection());
        return DriverManager.getConnection(schedulerDB.getDbDriver());
    }

    @Override
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
