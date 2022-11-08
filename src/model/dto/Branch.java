package model.dto;

import java.util.stream.Stream;

public enum Branch {
    FORD(0, "FORD"),
    CHEVROLET(1, "CHEVROLET"),
    FIAT(2, "FIAT"),
    RENAULT(3, "RENAULT"),
    PEUGEOT(4, "PEUGEOT");

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

    Branch(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static Branch getEnum(int code) {
        return Stream.of(Branch.values()).filter(x->x.code == code)
                .findFirst().orElseThrow(()->new IllegalArgumentException("Tipo de Documento No encontrado"));
    }
}
