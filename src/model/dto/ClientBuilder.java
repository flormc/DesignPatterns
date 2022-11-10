package model.dto;

import java.util.List;

public final class ClientBuilder {
    private long clientNumber;
    private List<Vehicle> vehicleList;
    private List<Turn> turns;
    private String name;
    private String lastName;
    private DocumentType documentType;
    private String documentNumber;

    private ClientBuilder() {
    }

    public static ClientBuilder aClient() {
        return new ClientBuilder();
    }

    public ClientBuilder withClientNumber(long clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }

    public ClientBuilder withVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
        return this;
    }

    public ClientBuilder withTurns(List<Turn> turns) {
        this.turns = turns;
        return this;
    }

    public ClientBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ClientBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ClientBuilder withDocumentType(DocumentType documentType) {
        this.documentType = documentType;
        return this;
    }

    public ClientBuilder withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    public Client build() {
        Client client = new Client();
        client.setClientNumber(clientNumber);
        client.setVehicleList(vehicleList);
        client.setTurns(turns);
        client.setName(name);
        client.setLastName(lastName);
        client.setDocumentType(documentType);
        client.setDocumentNumber(documentNumber);
        return client;
    }
}
