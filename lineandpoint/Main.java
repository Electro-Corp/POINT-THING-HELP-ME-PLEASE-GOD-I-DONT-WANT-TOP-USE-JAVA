public class Main{
    public static void Main(String[] args){
        GrapherPanel panel = new GrapherPanel();
        
        Point a = new Point(3,4);
        Point b = new Point(10,5);
        Line c = new Line(a,b);
        panel.plotLine(c);
        Line d = c.getPerpBisector();
        panel.plotLine(d);
    }
}