package ru.otus.game.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.otus.game.interfaces.IMovable;

import static org.mockito.ArgumentMatchers.any;

public class MoveTest {
    private IMovable movableMock;

    @BeforeEach
    public void setUp() {
        movableMock = Mockito.mock(IMovable.class);
    }

    @Test
    void checkGetPositionException() {
        Mockito.when(movableMock.getPosition()).thenThrow(RuntimeException.class);

        Move move =  new Move(movableMock);
        Assertions.assertThrows(RuntimeException.class, move::Execute);
    }

    @Test
    void checkGetVelocityException() {
        Mockito.when(movableMock.getVelocity())
                .thenThrow(RuntimeException.class);

        Move move =  new Move(movableMock);
        Assertions.assertThrows(RuntimeException.class, move::Execute);
    }

    @Test
    void checkSetPositionException() {
        Mockito.doThrow(RuntimeException.class)
                .when(movableMock).setPosition(any());

        Move move =  new Move(movableMock);
        Assertions.assertThrows(RuntimeException.class, move::Execute);
    }
}
