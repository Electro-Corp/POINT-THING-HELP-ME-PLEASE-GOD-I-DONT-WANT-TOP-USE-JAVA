import java.lang.Math;
public class Parabola{
    Point p5 = new Point(0,0);
    double a,b,c;
    Parabola(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        p5 = new Point(0,(a * (0 * 0)) + (b * (0) )+ c);
    }
    
    public void render(GrapherPanel screen){
        // RENDER PARABOLA
        Point current;
        Point prev = p5;
        for(double i = 0; i < 10; i -= 0.01){
            current = new Point(i, (a * (i * i)) + (b * (i) )+ c);
            Line g = new Line(current,prev);
            screen.plotLine(g);
            prev = current; 
        }
        Point currentb;
        prev = p5;
        for(double i = 0; i > -10; i -= 0.01){
            current = new Point(i, (a * (i * i)) + (b * (i) )+ c);
            Line g = new Line(current,prev);
            screen.plotLine(g);
            prev = current; 
        }
        /* 
        // RENDER VERTEX
        Point vertex;
        vertex = new Point(((-1)*b)/(2*a),-1 * ((b*b) - 4*a*c) / (4*a));
        screen.plotPoint(vertex);        
        
        // X AND Y INTERCEPT RENDERING
        
        Point yint = new Point(0,(a * (0 * 0)) + (b * (0) )+ c);
        screen.plotPoint(yint);
        
        // x int
        
        //Point xintone = new Point((((-1*b) + Math.sqrt((b*b) + (4 * ( a * c))))/2*a),0);
        //screen.plotPoint(xintone);*/
    }
}