package model.db;

import java.util.List;

public final class ClientDaoBuilder {
    private String name;
    private String lastName;
    private int documentType;
    private int clientNumber;
    private String documentNumber;
    private List<VehicleDao> vehicleDaos;
    private List<TurnDao> turns;

    private ClientDaoBuilder() {
    }

    public static ClientDaoBuilder aClientDao() {
        return new ClientDaoBuilder();
    }

    public ClientDaoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ClientDaoBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ClientDaoBuilder withDocumentType(int documentType) {
        this.documentType = documentType;
        return this;
    }

    public ClientDaoBuilder withClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }

    public ClientDaoBuilder withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    public ClientDaoBuilder withVehicleDaos(List<VehicleDao> vehicleDaos) {
        this.vehicleDaos = vehicleDaos;
        return this;
    }

    public ClientDaoBuilder withTurns(List<TurnDao> turns) {
        this.turns = turns;
        return this;
    }

    public ClientDao build() {
        ClientDao clientDao = new ClientDao();
        clientDao.setName(name);
        clientDao.setLastName(lastName);
        clientDao.setDocumentType(documentType);
        clientDao.setClientNumber(clientNumber);
        clientDao.setDocumentNumber(documentNumber);
        clientDao.setVehicleDaos(vehicleDaos);
        clientDao.setTurns(turns);
        return clientDao;
    }
}
