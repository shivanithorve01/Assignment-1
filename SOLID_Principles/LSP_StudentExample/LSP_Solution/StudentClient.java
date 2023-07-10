public class StudentClient {
    public static void main(String[] args) {
        Student student = new Student("Shivani", 20);
        student.study();

        Student undergraduate = new UndergraduateStudent("Vaishnavi", 19);
        undergraduate.study();
    }
}

