package practiceEx.polymorphismPrac2;

public class Contributors {

    String name;

    public Contributors(String name) {
        this.name = name;
    }

    public double calculatePayment(){
        return 0.0;
    }

    public void displayInfo(){
        System.out.println("Contributor's name: "+name);
        System.out.println("Payment is: "+calculatePayment());
    }
}
