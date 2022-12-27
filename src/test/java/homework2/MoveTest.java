package homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.game.entity.Coords;

public class MoveTest {
    @Test
    void checkCoordsChange() {
        // x^2 + 1 = 0
        Coords position = new Coords(12, 5);
        Coords velocity = new Coords(-7, 3);
        Coords newPosition = new Coords(5, 8);

        Assertions.assertEquals(newPosition, Coords.Plus(position, velocity));
    }
}
