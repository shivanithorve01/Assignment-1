// Derived class representing an undergraduate student
public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int age) {
        super(name, age);
    }

    // This violates the Liskov Substitution Principle
    @Override
    public void study() {
        System.out.println("Undergraduate student is studying.");
    }
}
