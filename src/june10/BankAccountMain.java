package june10;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount bankAccount = new SavingsAccount();
        bankAccount.accountNumber = "M1234";
        bankAccount.balance = 65000.99;
        System.out.println("Current balance: "+bankAccount.balance);
        bankAccount.deposit(599.00);
        bankAccount.withDraw(100);
        bankAccount.displayBalance();

        System.out.println("----------------------------------------------------------");

        BankAccount bankAccount1 = new ChequingAccount();
        bankAccount1.accountNumber = "M2345";
        bankAccount1.balance = 35000.98;
        System.out.println("Current balance in Chequing account: "+bankAccount1.balance);
        bankAccount1.deposit(1200.00);
        bankAccount1.withDraw(1000);
        bankAccount1.displayBalance();

        System.out.println("----------------------------------------------------------");

        BankAccount bankAccount2 = new HighInterestSavingAccount();
        bankAccount2.accountNumber = "M3456";
        bankAccount2.balance = 10000.00;
        System.out.println("Current balance in HighInterestSaving Account is: "+bankAccount2.balance);
        bankAccount2.deposit(555.55);
        bankAccount2.withDraw(100);
        bankAccount2.displayBalance();

    }

}
