package practiceEx.polymorphismPrac;

public class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void displayDetails(){
        System.out.println("Employee Name is: "+name);
    }

}
