package ru.otus.game.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
public class Coords {
    @Getter
    private int x;
    @Getter
    private int y;

    public static Coords Plus(Coords position, Coords velocity) {

        return new Coords(
                position.getX() + velocity.getX(),
                position.getY() + velocity.getY());
    }
}
