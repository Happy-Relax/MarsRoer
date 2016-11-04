package rover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void shouldBeAbleToChangePosition() {
        assertThat(new Position(1,1).change(new Position(0, 1)), is(new Position(1, 2)));
        assertThat(new Position(1,1).change(new Position(1, 0)), is(new Position(2, 1)));
        assertThat(new Position(1,1).change(new Position(-1, -1)), is(new Position(0, 0)));
    }
}