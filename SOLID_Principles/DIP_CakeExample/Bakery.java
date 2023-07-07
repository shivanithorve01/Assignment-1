public class Bakery {
    private Cake cake;
  
    public Bakery(Cake cake) {
        this.cake = cake;
    }
  
    public void bakeCake() {
        cake.bake();
    }
}
