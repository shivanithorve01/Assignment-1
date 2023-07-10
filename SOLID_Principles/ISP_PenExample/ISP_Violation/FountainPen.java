public class FountainPen implements Pen {
    @Override
    public void write(String text) {
        System.out.println("Fountain pen is writing: " + text);
    }
  
    @Override
    public void draw() {
        System.out.println("Fountain pen is drawing");
    }
  
    @Override
    public void erase() {
        // Erase method not applicable for a marker pen
        throw new UnsupportedOperationException("Fountain pen cannot erase");
    }
}
