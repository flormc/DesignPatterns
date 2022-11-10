package model.db;

import java.util.List;

public class ClientDao {
    private String name;
    private String lastName;
    private int documentType;
    private int clientNumber;
    private String documentNumber;
    private List<VehicleDao> vehicleDaos;
    private List<TurnDao> turns;

    public ClientDao() {
    }

    public ClientDao(String name,
                     String lastName,
                     int documentType,
                     String documentNumber,
                     int clientNumber,
                     List<VehicleDao> vehicleDaos,
                     List<TurnDao> turns) {
        this.name = name;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.clientNumber = clientNumber;
        this.vehicleDaos = vehicleDaos;
        this.turns = turns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public List<VehicleDao> getVehicleDaos() {
        return vehicleDaos;
    }

    public void setVehicleDaos(List<VehicleDao> vehicleDaos) {
        this.vehicleDaos = vehicleDaos;
    }

    public List<TurnDao> getTurns() {
        return turns;
    }

    public void setTurns(List<TurnDao> turns) {
        this.turns = turns;
    }
}
