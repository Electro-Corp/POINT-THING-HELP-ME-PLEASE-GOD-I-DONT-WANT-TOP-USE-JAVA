public class Main{
    public static void Main(String[] args){
        GrapherPanel panel = new GrapherPanel();
        
        Point a = new Point(6,3);
        Point b = new Point(-4,-1);
        Line c = new Line(a,b);
        panel.plotLine(c);
        System.out.println("hey");
        Line d = c.getPerpBisector();
        System.out.println("done lamo");
        panel.plotLine(d);
    }
}