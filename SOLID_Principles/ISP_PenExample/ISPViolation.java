// Interface representing actions a pen can perform
public interface Pen {
    void write(String text);
    void draw();
    void erase();
}

// Implementing class for a ballpoint pen
public class BallpointPen implements Pen {
    @Override
    public void write(String text) {
        System.out.println("Ballpoint pen is writing: " + text);
    }
  
    @Override
    public void draw() {
        System.out.println("Ballpoint pen is drawing");
    }
  
    @Override
    public void erase() {
        // Erase method not applicable for a ballpoint pen
        throw new UnsupportedOperationException("Ballpoint pen cannot erase");
    }
}

// Implementing class for a marker pen
public class FountainPen implements Pen {
    @Override
    public void write(String text) {
        System.out.println("Marker pen is writing: " + text);
    }
  
    @Override
    public void draw() {
        System.out.println("Marker pen is drawing");
    }
  
    @Override
    public void erase() {
        // Erase method not applicable for a marker pen
        throw new UnsupportedOperationException("Marker pen cannot erase");
    }
}

// Client code using the pen interface
public class PenClient {
    public static void main(String[] args) {
        Pen ballpointPen = new BallpointPen();
        ballpointPen.write("Ball Pen");
        ballpointPen.draw();

        Pen FountainPen = new FountainPen();
        FountainPen.write("Marker Pen");
        FountainPen.draw();
    }
}

