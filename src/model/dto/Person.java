package model.dto;

public abstract class Person {

    private String name;
    private String lastName;
    private DocumentType documentType;
    private String documentNumber;

    public Person() {}

    public Person(String name, String lastName, DocumentType documentType, String documentNumber) {
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
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

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

}
