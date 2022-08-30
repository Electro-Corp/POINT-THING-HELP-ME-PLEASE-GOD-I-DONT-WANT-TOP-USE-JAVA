import java.lang.Math;
public class Line{
    Point a;
    Point b;
    Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    Point getPointA(){
        return a;
    }
    Point getPointB(){
        return b;
    }
    double getSlope(){
        return (a.y - b.y)/(a.x-b.x);
    }
    double getLength(){
        double a_ok = a.y - b.y;
        double b_ok = a.x - b.x;
        return Math.sqrt((a_ok * a_ok)+(b_ok*b_ok));
    }
    Point getMidpoint(){
        Point d = new Point((a.x+b.x)/2,(a.y+b.y)/2);
        return d;
    }
    String getString(){
        String d = "("+a.x+","+a.y+")"+"->("+b.x+","+b.y+")";
        return d;
    }
    Line getPerpBisector(){
        Point d = new Point(this.getMidpoint().x,this.getMidpoint().y);
        double disA 
        Point g = new Point();
        Line e = new Line(d,g);
        
        return e;
    }
}