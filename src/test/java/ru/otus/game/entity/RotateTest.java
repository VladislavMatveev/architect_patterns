package ru.otus.game.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.otus.game.interfaces.IRotable;

import static org.mockito.ArgumentMatchers.anyDouble;

public class RotateTest {

    @Test
    void checkGetAngularException() {
        IRotable rotableMock = Mockito.mock(IRotable.class);
        Mockito.when(rotableMock.getAngular())
                .thenThrow(RuntimeException.class);

        Rotate rotate = new Rotate(rotableMock);
        Assertions.assertThrows(RuntimeException.class, rotate::Execute);
    }

    @Test
    void checkGetAngularVelocityException() {
        IRotable rotableMock = Mockito.mock(IRotable.class);
        Mockito.when(rotableMock.getAngularVelocity())
                .thenThrow(RuntimeException.class);

        Rotate rotate = new Rotate(rotableMock);
        Assertions.assertThrows(RuntimeException.class, rotate::Execute);
    }

    @Test
    void checkSetAngularException() {
        IRotable rotableMock = Mockito.mock(IRotable.class);
        Mockito.doThrow(RuntimeException.class)
                .when(rotableMock).setAngular(anyDouble());

        Rotate rotate = new Rotate(rotableMock);
        Assertions.assertThrows(RuntimeException.class, rotate::Execute);
    }
}
