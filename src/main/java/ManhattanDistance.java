public class ManhattanDistance {

    public int manhattanDistance(Point start, Point end) {
        int xResult = Math.max(start.x,end.x) - Math.min(start.x, end.x);
        int yResult = Math.max(start.y,end.y) - Math.min(start.y, end.y);
        int result = xResult + yResult;
        return result;
    }
}
