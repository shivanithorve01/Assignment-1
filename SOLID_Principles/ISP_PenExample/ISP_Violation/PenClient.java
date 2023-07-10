public class PenClient {
    public static void main(String[] args) {
        Pen ballpointPen = new BallpointPen();
        ballpointPen.write("Ball Pen is writing..");
        ballpointPen.draw();

        Pen FountainPen = new FountainPen();
        FountainPen.write("Fountain Pen is writing..");
        FountainPen.draw();
    }
}

