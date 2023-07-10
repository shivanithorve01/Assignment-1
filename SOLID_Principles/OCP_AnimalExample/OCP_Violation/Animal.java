// Animal class representing different types of animals
public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void makeSound() {
        if (type.equals("Dog")) {
            System.out.println("Dog makes barking sound.");
        } else if (type.equals("Cat")) {
            System.out.println("Cat makes meowing sound.");
        }
    }
}

