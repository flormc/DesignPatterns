package model.dto;

import java.util.stream.Stream;

public enum StateTurn {
    CREATED(0, "CREADO"),
    CONFIRM(1, "CONFIRMADO"),
    CANCELED(2, "CANCELADO");

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

    StateTurn(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static StateTurn getEnum(int code) {
        return Stream.of(StateTurn.values()).filter(x->x.code == code)
                .findFirst().orElseThrow(()->new IllegalArgumentException("Tipo de Documento No encontrado"));
    }
}
