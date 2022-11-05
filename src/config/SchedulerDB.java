package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SchedulerDB {
    private static SchedulerDB instance;
    public static final String SRC_RESOURCES_CONFIG_PROPERTIES = "src/resources/config.properties";
    public static final String DRIVER_SQLITE = "DRIVER_SQLITE";
    public static final String DBURL_SQLITE = "DBURL_SQLITE";
    private String stringConnection;

    private String dbDriver;

    private SchedulerDB() {
        this.readProperties();
    }

    public void readProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(SRC_RESOURCES_CONFIG_PROPERTIES));
            this.setStringConnection(properties.getProperty(DRIVER_SQLITE));
            this.setDbDriver(properties.getProperty(DBURL_SQLITE));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static SchedulerDB getInstance() {
        if (instance == null) {
            instance = new SchedulerDB();
        }
        return instance;
    }

    private void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    private void setStringConnection(String stringConnection) {
        this.stringConnection = stringConnection;
    }

    public String getStringConnection() {
        return stringConnection;
    }

    public String getDbDriver() {
        return dbDriver;
    }
}
