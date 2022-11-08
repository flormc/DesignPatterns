package model.dto;

import java.util.stream.Stream;

public enum Speciality {
    CHAPA_Y_PINTURA(0, "CHAPA Y PINTURA"),
    FRENOS(1, "FRENOS");

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

    Speciality(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static Speciality getEnum(int code) {
        return Stream.of(Speciality.values()).filter(x->x.code == code)
                .findFirst().orElseThrow(()->new IllegalArgumentException("Tipo de Documento No encontrado"));
    }
}
