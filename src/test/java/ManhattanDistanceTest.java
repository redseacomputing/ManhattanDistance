import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanDistanceTest {

    ManhattanDistance manhattanDistance;

    @BeforeEach
    void createNewManhattanDistance() {
        manhattanDistance = new ManhattanDistance();
    }

    @Test
    @DisplayName("test x coordinate")
    void testXCoordinate() {
        int result = manhattanDistance.of(new Point(5,0), new Point(1, 0));
        assertEquals(4, result);
    }

    @Test
    @DisplayName("test y coordinate")
    void testYCoordinate() {
        int result = manhattanDistance.of(new Point(0,100) , new Point(0, 99));
        assertEquals(1, result);
    }

    @Test
    @DisplayName("test negative values")
    void testNegativeValues() {
        int result = manhattanDistance.of(new Point(0, 0), new Point(200,200));
        assertEquals(400, result );
    }

    @Test
    @Disabled
    @DisplayName("test negative maximum value of x coordinate from the start point")
    void testNegativeMaximumValueOfXFromTheStartPoint() {
        int result = manhattanDistance.of(new Point(Integer.MIN_VALUE, 0), new Point(0,0));
        assertEquals(Math.abs(Integer.MIN_VALUE), result);
    }
    @Test
    @Disabled
    @DisplayName("test negative maximum value of x coordinate from the end point")
    void testNegativeMaximumValuesOfXFromTheEndPoint() {
        int result = manhattanDistance.of(new Point(0, 0), new Point(Integer.MIN_VALUE,0));
        assertEquals(Math.abs(Integer.MIN_VALUE), result);
    }

    @Test
    @Disabled
    @DisplayName("test negative maximum value of y coordinate from the end point")
    void testMaximumValuesOfYFromTheStartPoint() {
        int result = manhattanDistance.of(new Point(0, Integer.MIN_VALUE), new Point(0,0));
        assertEquals(Math.abs(Integer.MIN_VALUE), result);
    }

    @Test
    @Disabled
    @DisplayName("test negative maximum value of y coordinate from the end point")
    void testMaximumValuesOFXFromTheEndPoint() {
        int result = manhattanDistance.of(new Point(0, 0), new Point(0,Integer.MIN_VALUE));
        assertEquals(Math.abs(Integer.MIN_VALUE), result);
    }

    @Test
    @Disabled
    @DisplayName("test maximum negative and maximum positive vale from X coordinate")
    void testMaximumNegativeAndMaximumPositiveValeFromXCoordinate() {
        int result = manhattanDistance.of(new Point(Integer.MIN_VALUE,0), new Point(Integer.MAX_VALUE,0));
        assertEquals(1,result );
    }








}