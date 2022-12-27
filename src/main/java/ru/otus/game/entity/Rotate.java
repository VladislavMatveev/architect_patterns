package ru.otus.game.entity;

import lombok.AllArgsConstructor;
import ru.otus.game.interfaces.IRotable;

@AllArgsConstructor
public class Rotate {
    private IRotable rotable;

    public void Excute() {
        this.rotable.setAngular(
            this.rotable.getAngular() + this.rotable.getAngularVelocity()
        );
    }
}
