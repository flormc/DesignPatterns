package model.dto;

import java.util.stream.Stream;

public enum Model {
    FIESTA(0, "FIESTA"),
    CHEXA(1, "CHEXA"),
    PALIO(2, "PALIO"),
    DUSTER(3, "DUSTER"),
    P306(4, "P306");

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

    Model(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static Model getEnum(int code) {
        return Stream.of(Model.values()).filter(x->x.code == code)
                .findFirst().orElseThrow(()->new IllegalArgumentException("Tipo de Documento No encontrado"));
    }
}
