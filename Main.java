public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", "Smith");
        Student s2 = new Student("Jane", "Doe");
        s1.prettyPrint();
        s2.prettyPrint();
        System.out.println("Number of students: " + Student.getNumberOfStudents());
    }
}
