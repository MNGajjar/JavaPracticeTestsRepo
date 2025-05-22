package may17;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Maitree","M4561",40000.50);
        bankAccount.displayAccountInfo();
        System.out.println("--------------------------------------");
        BankAccount bankAccount1 = new BankAccount("Someone","T1234",0);
        bankAccount1.displayAccountInfo();

        System.out.println("--------------------------------------");

        System.out.println("Account details after withdrawal amount..!");
        System.out.println("--------------------------------------");
        System.out.println("Maitree's Account");
        bankAccount.withDraw(250);
        System.out.println("--------------------------------------");
        System.out.println("Someone's Account");
        bankAccount1.withDraw(100);

    }
}
