package practiceEx.polymorphismPrac2;

public class Employee extends Contributors{

    double baseSalary;
    double bonus;

    public Employee(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayment() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Payment: "+calculatePayment());
    }
}
