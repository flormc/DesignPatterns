package model.dto;

import java.util.List;

public class Client extends Person {
    private long clientNumber;
    private List<Vehicle> vehicleList;

    public Client() {
        super();
    }

    public Client(final String name,
                  final String lastName,
                  final DocumentType documentType,
                  final String documentNumber,
                  final long clientNumber,
                  List<Vehicle> vehicleList) {
        super(name, lastName, documentType, documentNumber);
        this.clientNumber = clientNumber;
        this.vehicleList = vehicleList;
    }

    public long getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(long clientNumber) {
        this.clientNumber = clientNumber;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
