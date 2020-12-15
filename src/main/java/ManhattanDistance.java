public class ManhattanDistance {

    public int of(Point start, Point end) {
        if(!validatePoints(start,end)){
            System.err.println("Coordinates have to be equal or more than zero");
            System.exit(-1);
        }

            int xResult = Math.max(start.x, end.x) - Math.min(start.x, end.x);
            int yResult = Math.max(start.y, end.y) - Math.min(start.y, end.y);
            int result = Math.abs(xResult) + Math.abs(yResult);

            return Math.abs(result);

        }

        private boolean validatePoints(Point start, Point end){
            if (start.x < 0 || start.y < 0 || end.x < 0 || end.y == 0){
                return false;
            }
            return true;
        }

    }

