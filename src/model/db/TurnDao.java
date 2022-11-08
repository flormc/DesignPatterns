package model.db;

import java.time.LocalDate;
import java.time.LocalTime;

public class TurnDao {
    private int id;
    private LocalDate createDate;
    private LocalDate modifyDate;
    private String time;
    private String policyNumber;
    private int specialty;
    private int stateTurn;

    public TurnDao(int id, LocalDate createDate,
                   LocalDate modifyDate, String time,
                   String policyNumber, int specialty,
                   int stateTurn) {
        this.id = id;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.time = time;
        this.policyNumber = policyNumber;
        this.specialty = specialty;
        this.stateTurn = stateTurn;
    }

    public TurnDao() {}

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

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getSpecialty() {
        return specialty;
    }

    public void setSpecialty(int specialty) {
        this.specialty = specialty;
    }

    public int getStateTurn() {
        return stateTurn;
    }

    public void setStateTurn(int stateTurn) {
        this.stateTurn = stateTurn;
    }
}
