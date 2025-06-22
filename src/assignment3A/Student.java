package assignment3A;

public class Student extends Person{
    private String studentID;
    private String course;
    private double gpa;

    public Student(String name, int age, String studentID, String course, double gpa) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.gpa = gpa;
        University.incrementTotalStudents();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: "+studentID);
        System.out.println("Course: "+course);
        System.out.println("GPA: "+gpa);
    }
}
