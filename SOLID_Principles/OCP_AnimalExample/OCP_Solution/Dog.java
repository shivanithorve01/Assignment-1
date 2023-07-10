// Concrete classes representing specific animals
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes barking sound.");
    }
}
