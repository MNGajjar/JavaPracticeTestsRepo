package practiceEx.polymorphismPrac;

public class FullTimeEmployee extends Employee{

    private double mothlySalary;


    public FullTimeEmployee(String name, double mothlySalary) {
        super(name);
        this.mothlySalary = mothlySalary;
    }

    public double calculateSalary(){
        return mothlySalary;
    }

    public void displayDetails(){
        System.out.println("FullTime Employee: " +name);
        System.out.println("Monthly Salary: "+ calculateSalary());
    }

}
