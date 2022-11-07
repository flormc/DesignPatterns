package model.db;

public class ClientDao {
    private String name;
    private String lastName;
    private int documentType;
    private int clientNumber;
    private String documentNumber;

    public ClientDao() {
    }

    public ClientDao(String name,
                     String lastName,
                     int documentType,
                     String documentNumber,
                     int clientNumber) {
        this.name = name;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.clientNumber = clientNumber;
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
}
