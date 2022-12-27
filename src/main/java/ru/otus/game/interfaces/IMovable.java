package ru.otus.game.interfaces;

import ru.otus.game.entity.Coords;

public interface IMovable {
    Coords getPosition();
    void setPosition(Coords newValue);
    Coords getVelocity();
}
