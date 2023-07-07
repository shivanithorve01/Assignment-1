public class PenClient 
{
    public static void main(String[] args) 
    {
        Pen ballpointPen = new BallPointPen();
        ballpointPen.write("Hello World!");
        ballpointPen.draw();

        Pen fountainPen = new FountainPen();
        fountainPen.write("It's a Fountain Pen");
        fountainPen.draw();
    }
}
