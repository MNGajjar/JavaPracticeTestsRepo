package assignment3A;

public class Professor extends Person{

    private String employeeID;
    private String department;
    private double salary;

    public Professor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        University.incrementTotalProfessors();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
    }
}
