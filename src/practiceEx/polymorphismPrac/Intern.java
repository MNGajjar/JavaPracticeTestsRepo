package practiceEx.polymorphismPrac;

public class Intern extends Employee{
    private double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern name: "+name);
        System.out.println("Intern Stipend: "+calculateSalary());
    }
}
