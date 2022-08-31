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
        //(xcos(θ)−ysin(θ),xsin(θ)+ycos(θ)).
        
        
        double negslope = this.getSlope();
        negslope = negslope * -1;
        
        double anewx = a.x - d.x;
        double anewy = a.y - d.y;
        
        double bnewx = b.x - d.x;
        double bnewy = b.y - d.y;
        
        double gx = anewx * Math.cos(Math.toRadians(90));
        gx = gx - (anewy * Math.sin(Math.toRadians(90)));
        double gy = anewx * Math.sin(Math.toRadians(90));
        gy = gy + (anewy * Math.cos(Math.toRadians(90)));
        
        gy = gy + d.y;
        gx = gx + d.x;
        
        double fx = bnewx * Math.cos(Math.toRadians(90));
        fx = fx - (bnewy * Math.sin(Math.toRadians(90)));
        double fy = bnewx * Math.sin(Math.toRadians(90));
        fy = fy + (bnewy * Math.cos(Math.toRadians(90)));
        
        fx = fx + d.x;
        fy = fy + d.y;    
    
        
        //Point g = new Point(((a.x*Math.cos(Math.toRadians(90)))-(a.y-Math.sin(Math.toRadians(90)))), a.y);
        //Point f = new Point(((b.x*Math.sin(Math.toRadians(90)))-(b.y-Math.cos(Math.toRadians(90)))), b.y);
        Point g = new Point(gx,gy);
        Point f = new Point(fx,fy);
        Line e = new Line(g,f);
        
        //double a_ok = a.y - b.y;
        //double b_ok = a.x - b.x;
        /*double disA = (d.x-a.x);
        double disB = (d.x-b.x);
    
        
        Point g = new Point(2*disA + d.x,a.y);
        Point f = new Point(2*disB + d.x, b.y);
        Line e = new Line(g,f);
        */
        return e;
    }
}
