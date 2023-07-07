public class CakeClient {
    public static void main(String[] args) {
        Cake chocolateCake = new ChocolateCake();
        Bakery bakery1 = new Bakery(chocolateCake);
        bakery1.bakeCake();

        Cake vanillaCake = new VanillaCake();
        Bakery bakery2 = new Bakery(vanillaCake);
        bakery2.bakeCake();
    }
}
