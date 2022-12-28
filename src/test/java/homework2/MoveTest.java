package homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.otus.game.entity.Coords;
import ru.otus.game.interfaces.IMovable;

import static org.mockito.ArgumentMatchers.any;

public class MoveTest {
    @Test
    void checkCoordsChange() {
        // x^2 + 1 = 0
        Coords position = new Coords(12, 5);
        Coords velocity = new Coords(-7, 3);
        Coords newPosition = new Coords(5, 8);

        Assertions.assertEquals(newPosition, Coords.Plus(position, velocity));
    }

    @Test
    void checkGetPositionException() {
        IMovable movableMock = Mockito.mock(IMovable.class);
        Mockito.when(movableMock.getPosition()).thenThrow(RuntimeException.class);

        Assertions.assertThrows(RuntimeException.class, movableMock::getPosition);
    }

    @Test
    void checkGetVelocityException() {
        IMovable movableMock = Mockito.mock(IMovable.class);
        Mockito.when(movableMock.getVelocity())
                .thenThrow(RuntimeException.class);

        Assertions.assertThrows(RuntimeException.class, movableMock::getVelocity);
    }

    @Test
    void checkSetPositionException() {
        IMovable movableMock = Mockito.mock(IMovable.class);
        Mockito.doThrow(RuntimeException.class)
                .when(movableMock).setPosition(any());

        Assertions.assertThrows(RuntimeException.class, () -> movableMock.setPosition(any()));
    }

}
