package model.dto;

import java.time.LocalDate;

public final class TurnBuilder {
    private int id;
    private LocalDate createDate;
    private LocalDate modifyDate;
    private String time;
    private Speciality specialty;
    private StateTurn stateTurn;

    private TurnBuilder() {
    }

    public static TurnBuilder aTurn() {
        return new TurnBuilder();
    }

    public TurnBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public TurnBuilder withCreateDate(LocalDate createDate) {
        this.createDate = createDate;
        return this;
    }

    public TurnBuilder withModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public TurnBuilder withTime(String time) {
        this.time = time;
        return this;
    }

    public TurnBuilder withSpecialty(Speciality specialty) {
        this.specialty = specialty;
        return this;
    }

    public TurnBuilder withStateTurn(StateTurn stateTurn) {
        this.stateTurn = stateTurn;
        return this;
    }

    public Turn build() {
        Turn turn = new Turn();
        turn.setId(id);
        turn.setCreateDate(createDate);
        turn.setModifyDate(modifyDate);
        turn.setTime(time);
        turn.setSpecialty(specialty);
        turn.setStateTurn(stateTurn);
        return turn;
    }
}
