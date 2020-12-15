import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanDistanceTest {

    ManhattanDistance manhattanDistance;

    @BeforeEach
    void createNewManhattanDistance() {
        manhattanDistance = new ManhattanDistance();
    }

    @Test
    void manhattanDistance_should_return_4_on_x_coordinate() {
        int result = manhattanDistance.of(new Point(5, 0), new Point(1, 0));
        assertEquals(4, result);
    }

    @Test
    void manhattanDistance_should_return_1_on_y_coordinate() {
        int result = manhattanDistance.of(new Point(0, 100), new Point(0, 99));
        assertEquals(1, result);
    }

    @Test
    void manhattanDistance_should_return_400_on_negative_and_positive_points() {
        int result = manhattanDistance.of(new Point(-100, -100), new Point(100, 100));
        assertEquals(400, result);
    }

    @Test
    void manhattanDistance_should_validate_coordinate_points_from_start_point_on_x_coordinate_and_throw_exception() {
        Exception exception = assertThrows(
                CorruptCoordinatesOfClassPointException.class,
                () -> manhattanDistance.of(new Point(Integer.MIN_VALUE, 0), new Point(0, 0)));

        assertTrue(exception.getMessage().contains("Corrupt coordinate values"));
    }

    @Test
    void manhattanDistance_should_validate_coordinate_points_from_start_point_on_y_coordinate_and_throw_exception() {
        Exception exception = assertThrows(
                CorruptCoordinatesOfClassPointException.class,
                () -> manhattanDistance.of(new Point(0, Integer.MAX_VALUE + 1), new Point(0, 0)));

        assertTrue(exception.getMessage().contains("Corrupt coordinate values"));
    }

    @Test
    void manhattanDistance_should_validate_coordinate_points_from_end_point_on_x_coordinate_and_throw_exception() {
        Exception exception = assertThrows(
                CorruptCoordinatesOfClassPointException.class,
                () -> manhattanDistance.of(new Point(0, 0), new Point(Integer.MIN_VALUE / 4 - 1, 0)));

        assertTrue(exception.getMessage().contains("Corrupt coordinate values"));
    }

    @Test
    void manhattanDistance_should_validate_coordinate_points_from_end_point_on_y_coordinate_and_throw_exception() {
        Exception exception = assertThrows(
                CorruptCoordinatesOfClassPointException.class,
                () -> manhattanDistance.of(new Point(0, 0), new Point(0, Integer.MIN_VALUE)));

        assertTrue(exception.getMessage().contains("Corrupt coordinate values"));
    }


    @Test
    void manhattanDistance_should_return_complete_Value_minus_one_of_datatype_integer() {
        int result = manhattanDistance.of(new Point(Integer.MIN_VALUE / 4, Integer.MIN_VALUE / 4), new Point(Integer.MAX_VALUE / 4, Integer.MAX_VALUE / 4));
        assertEquals(Integer.MAX_VALUE - 1, result);
    }

    @Test
    void manhattanDistance_should_return_complete_Value_minus_one_of_datatype_integer_with_inverse_values() {
        int result = manhattanDistance.of(new Point(Integer.MAX_VALUE / 4, Integer.MAX_VALUE / 4), new Point(Integer.MIN_VALUE / 4, Integer.MIN_VALUE / 4));
        assertEquals(Integer.MAX_VALUE - 1, result);
    }

    @Test
    void manhattanDistance_should_return_Zero_with_maximum_positive_boundary() {
        int result = manhattanDistance.of(new Point(Integer.MAX_VALUE / 4, Integer.MAX_VALUE / 4), new Point(Integer.MAX_VALUE / 4, Integer.MAX_VALUE / 4));
        assertEquals(0, result);
    }


}