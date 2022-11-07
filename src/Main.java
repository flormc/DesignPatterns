import config.SchedulerDB;
import dao.ConnectionFacadeImpl;
import view.home.Home;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionFacadeImpl connectionFacade = new ConnectionFacadeImpl(SchedulerDB.getInstance());
        connectionFacade.startConnection();

        new Home().setVisible(true);
    }
}
