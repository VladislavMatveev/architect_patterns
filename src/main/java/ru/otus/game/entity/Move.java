package ru.otus.game.entity;

import lombok.AllArgsConstructor;
import ru.otus.game.interfaces.IMovable;

@AllArgsConstructor
public class Move {

    private IMovable movable;

    public void Execute() {
        this.movable.setPosition(
            Coords.Plus(
                    this.movable.getPosition(),
                    this.movable.getVelocity()
            )
        );
    }
}
