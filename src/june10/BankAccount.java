package june10;

public abstract class BankAccount {

    public String accountNumber;
    public double balance;

      abstract void deposit(double amount);
      abstract void withDraw(double amount);

    public void displayBalance(){
        System.out.println("Account number is: "+accountNumber);
        System.out.println("Your current Balance is: " +balance);
    }
}
