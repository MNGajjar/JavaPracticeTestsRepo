package practiceEx.polymorphismPrac2;

public class Freelancer extends Contributors{

    int hoursWorked;
    double hourlyRate;

    public Freelancer(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate*hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Freelancer's Name: "+name);
        System.out.println("Payment: "+ calculatePayment());
    }
}
