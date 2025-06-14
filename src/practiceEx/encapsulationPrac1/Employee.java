package practiceEx.encapsulationPrac1;

//Employee Payroll System---------------------

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 10000){
            //System.out.println("Salary cannot be too low.! Setting salary to 10,000");
            this.salary = 10000;
        }
        else {
            this.salary = salary;
        }
    }

    public double calculateAnnualSalary(){
        double anuualSalary = this.salary * 12;
        return anuualSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", Annual Salary='" + calculateAnnualSalary() + '\'' +
                '}';
    }
}
