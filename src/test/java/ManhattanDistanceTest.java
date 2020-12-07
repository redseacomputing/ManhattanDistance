import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanDistanceTest {

    ManhattanDistance manhattanDistance;

    @BeforeEach
    void setUp() {
        manhattanDistance = new ManhattanDistance();
    }

    @Test
    @DisplayName("test abstract data type point")
    void testAbstractDataTypePoint() {
        Point one = new Point(0,0);
        Point two = one;
        assertEquals(one,two);
    }

    @Test
    @DisplayName("test method manhattan distance")
    void testMethodManhattanDistance() {
        int result = manhattanDistance.manhattanDistance(new Point(0,0),new Point(0,0));
        assertEquals(0, result);
    }

    @Test
    @DisplayName("test x coordinate")
    void testXCoordinate() {
        int result = manhattanDistance.manhattanDistance(new Point(5,0), new Point(1, 0));
        assertEquals(4, result);
    }

    @Test
    @DisplayName("test y coordinate")
    void testYCoordinate() {
        int result = manhattanDistance.manhattanDistance(new Point(0,100) , new Point(0, 99));
        assertEquals(1, result);
    }

    @Test
    @DisplayName("test negative values")
    void testNegativeValues() {
        int result = manhattanDistance.manhattanDistance(new Point(-100, -100), new Point(100,100));
        assertEquals(400, result );
    }

}