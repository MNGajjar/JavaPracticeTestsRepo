package practiceEx.polymorphismPrac2;

public class Volunteer extends Contributors{

    public Volunteer(String name) {
        super(name);
    }

    @Override
    public double calculatePayment() {
        return 0.0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Voluneer name: "+name);
        System.out.println("Volunteer work..No Payment..! But thank you for your support.!");
    }
}
