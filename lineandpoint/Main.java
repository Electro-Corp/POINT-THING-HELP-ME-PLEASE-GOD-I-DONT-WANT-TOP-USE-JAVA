public class Main{
    public static void Main(String[] args){
        GrapherPanel panel = new GrapherPanel();
        
        /*Point a = new Point(6,3);
        Point b = new Point(-4,-1);
        Line c = new Line(a,b);
        panel.plotLine(c);
        panel.plotLine(c.getPerpBisector());
        */
       
        Parabola based = new Parabola(2,3,0);
        based.render(panel);
    }
}