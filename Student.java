/* 
The Student class is a good representation of Encapsulation. 
The class is declared as public, and the fields are declared as private. 
The class has a constructor that takes two parameters, and a method that prints the student's name. 
The class also has a static method that returns the number of students. 
*/
public class Student {
    // instance variables - local to each student object
    private String first;
    private String last;
    private int uniqueID;

    // class variables - shared by all student objects
    // An integer class variable named “nextUniqueID” that contains the unique ID number for the next student to be created.
    private static int nextUniqueID = 900000000; // 9 followed by 8 digits as the format for a unique ID number
    // An integer class variable named numberOfStudents that keeps track of the number of students added so far.
    private static int numberOfStudents = 0;
    
    public Student(String first, String last) {
        this.first = first;
        this.last = last;
        this.uniqueID = Student.nextUniqueID; // static class variables only accessible via the class idenfifier
        Student.nextUniqueID++; // increments so that the next student has a unique ID
        Student.numberOfStudents++;
    }

    // Getters
    public String getFirst() {
        return this.first;
    }
    public String getLast() {
        return this.last;
    }
    public String getFullName() {
        return this.first + " " + this.last;
    }
    public String getUniqueID() {
        return Integer.toString(this.uniqueID);
    }
    public static int getNumberOfStudents() {
        return Student.numberOfStudents;
    }
    public void prettyPrint() {
        System.out.println("Name: " + this.getFullName());
        System.out.println("ID: " + this.getUniqueID());
    }
    // Setters
    public String updateFirst(String first) {
        this.first = first;
        return this.first;
    }
    public String updateLast(String last) {
        this.last = last;
        return this.last;
    }
}