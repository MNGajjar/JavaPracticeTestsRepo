package may17;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount maitreeAccount = new BankAccount("Maitree","M4561",40000.50);
        maitreeAccount.displayAccountInfo();
        maitreeAccount.deposit(2000);

        System.out.println("--------------------------------------");

        BankAccount someoneAccount = new BankAccount("Someone","T1234",0);
        someoneAccount.displayAccountInfo();

        System.out.println("--------------------------------------");

        System.out.println("Account details after withdrawal amount..!");
        System.out.println("--------------------------------------");
        System.out.println("Maitree's Account");
        maitreeAccount.withDraw(-2500);
        maitreeAccount.withDraw(101);
        System.out.println("--------------------------------------");
        System.out.println("Someone's Account");
        someoneAccount.withDraw(100);

    }
}
