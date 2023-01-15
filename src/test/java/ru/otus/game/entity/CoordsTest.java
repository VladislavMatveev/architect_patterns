package ru.otus.game.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordsTest {
    @Test
    void checkCoordsChange() {
        // (12,5) + (-7,3) -> (5,8)
        Coords position = new Coords(12, 5);
        Coords velocity = new Coords(-7, 3);
        Coords newPosition = new Coords(5, 8);

        Assertions.assertEquals(newPosition, Coords.Plus(position, velocity));
    }
}