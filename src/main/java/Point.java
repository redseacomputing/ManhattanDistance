public final class Point {

    final int x;
    final int y;

    public Point(int x, int y) {
        if(x >= 0 && x < Integer.MAX_VALUE/2){
        this.x = x;} else this.x= Integer.MIN_VALUE;
        if(y >= 0 && y < Integer.MAX_VALUE/2){
        this.y = y;} else this.y= Integer.MIN_VALUE;
    }


}
