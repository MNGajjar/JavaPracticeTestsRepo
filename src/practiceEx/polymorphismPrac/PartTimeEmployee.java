package practiceEx.polymorphismPrac;

public class PartTimeEmployee extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    public void displayDetails(){
        System.out.println("PartTime Employee is: "+name);
        System.out.println("Sary of PartTime Employee is: "+calculateSalary());
    }

}
