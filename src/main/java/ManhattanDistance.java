public class ManhattanDistance {

    private final int MIN_COORDINATE_VALUE = Integer.MIN_VALUE/4;
    private final int MAX_COORDINATE_VALUE = Integer.MAX_VALUE/4;

    public int of(Point start, Point end) {

            validatePointsFrom(start,end);
            int xResult = Math.max(start.x, end.x) - Math.min(start.x, end.x);
            int yResult = Math.max(start.y, end.y) - Math.min(start.y, end.y);
            int result = Math.abs(xResult) + Math.abs(yResult);

            return Math.abs(result);

        }

        private void validatePointsFrom(Point start, Point end){
            if (start.x < MIN_COORDINATE_VALUE || start.x > MAX_COORDINATE_VALUE ||
                    start.y < MIN_COORDINATE_VALUE || start.y > MAX_COORDINATE_VALUE ||
                    end.x < MIN_COORDINATE_VALUE || end.x > MAX_COORDINATE_VALUE ||
                    end.y < MIN_COORDINATE_VALUE || end.y > MAX_COORDINATE_VALUE
            ){
                throw new CorruptCoordinatesOfClassPointException("Corrupt coordinate values");
            }
        }

    public class CorruptCoordinatesOfClassPointException extends RuntimeException {
        public CorruptCoordinatesOfClassPointException(String message) {
            super(message);
        }
    }
}

