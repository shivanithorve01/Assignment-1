public class BallPointPen implements Pen {
    @Override
    public void write(String text) {
        System.out.println("Ballpoint pen is writing: " + text);
    }
  
    @Override
    public void draw() {
        System.out.println("Ballpoint pen is drawing");
    }
}
