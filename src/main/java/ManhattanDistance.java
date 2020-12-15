public class ManhattanDistance {

    public int of(Point start, Point end) {


            int xResult = Math.max(start.x, end.x) - Math.min(start.x, end.x);
            int yResult = Math.max(start.y, end.y) - Math.min(start.y, end.y);
            int result = Math.abs(xResult) + Math.abs(yResult);

            return Math.abs(result);

        }

        private void validatePoints(Point start, Point end){
            if (start.x < 0 || start.y < 0 || end.x < 0 || end.y == 0){
                throw new CorruptCoordinatesOfClassPointException("Corrupt coordinate values");
            }
        }

    private class CorruptCoordinatesOfClassPointException extends RuntimeException {
        public CorruptCoordinatesOfClassPointException(String message) {
            super(message);
        }
    }
}

