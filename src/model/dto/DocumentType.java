package model.dto;

import java.util.stream.Stream;

public enum DocumentType {
    DNI(0, "DNI"),
    PASSPORT(1, "PASAPORTE");

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private int code;
    private String value;

    DocumentType(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static DocumentType getEnum(int code) {
        return Stream.of(DocumentType.values()).filter(x->x.code == code)
                .findFirst().orElseThrow(()->new IllegalArgumentException("Tipo de Documento No encontrado"));
    }
}
