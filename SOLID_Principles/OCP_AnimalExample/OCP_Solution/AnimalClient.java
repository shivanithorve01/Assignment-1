public class AnimalClient {
    public static void main(String[] args) {
        Animal dog = new Dog("Takudi", 7);
        Animal cat = new Cat("Mau", 3);

        AnimalActions.performAction(dog);
        AnimalActions.performAction(cat);
    }
}
