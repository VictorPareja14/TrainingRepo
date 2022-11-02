package BuildTower;

import org.junit.Test;

import static BuildTower.highLow.highAndLow;
import static org.junit.jupiter.api.Assertions.*;

public class highLowTest {

   @Test
    public void test1() {
        assertEquals("3 1", highAndLow("1 2 3"));
    }
}