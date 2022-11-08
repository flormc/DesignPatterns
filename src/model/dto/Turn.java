package model.dto;

import java.time.LocalDate;

public class Turn {
    private int id;
    private LocalDate createDate;
    private LocalDate modifyDate;
    private String time;
    private Speciality specialty;
    private StateTurn stateTurn;

    public Turn(int id, LocalDate createDate,
                LocalDate modifyDate, String time,
                Speciality specialty,
                StateTurn stateTurn) {
        this.id = id;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.time = time;
        this.specialty = specialty;
        this.stateTurn = stateTurn;
    }

    public Turn() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Speciality getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Speciality specialty) {
        this.specialty = specialty;
    }

    public StateTurn getStateTurn() {
        return stateTurn;
    }

    public void setStateTurn(StateTurn stateTurn) {
        this.stateTurn = stateTurn;
    }
}
