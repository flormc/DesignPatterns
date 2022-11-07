package model.dto;

public class Client extends Person {
    private long clientNumber;

    public Client() {
        super();
    }

    public Client(final String name,
                  final String lastName,
                  final DocumentType documentType,
                  final String documentNumber,
                  final long clientNumber) {
        super(name, lastName, documentType, documentNumber);
        this.clientNumber = clientNumber;
    }

    public long getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(long clientNumber) {
        this.clientNumber = clientNumber;
    }
}
