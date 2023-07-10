// Client code
public class AnimalClient {
    public static void main(String[] args) {
        Animal dog = new Animal("Takudi", "Dog");
        Animal cat = new Animal("Mau", "Cat");

        dog.makeSound();
        cat.makeSound();
    }
}

