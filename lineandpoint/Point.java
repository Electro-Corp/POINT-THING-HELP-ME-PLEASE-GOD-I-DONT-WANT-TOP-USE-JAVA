public class Point{
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    String tostring(){
        String s = "("+x+","+y+")";
        return s;
    }
}