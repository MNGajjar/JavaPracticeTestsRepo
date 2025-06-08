package practiceEx.encapsulationPrac;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    static int accountCount;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountCount++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){

        if(amount > 0){
            balance = balance+amount;
            System.out.println("Balance after deposit is: "+balance);
        }else {
            System.out.println("Please enter valid amount to deposit");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance = balance - amount;
            System.out.println("Balance after withdrawing amount: "+ balance);
        }else {
            System.out.println("Please enter valid amount");
        }
    }

    public void accountCount(){
        System.out.println("Total No. of Account: " +accountCount);
    }

    public void display(){
        System.out.println("Account holder name is: "+accountHolderName);
        System.out.println("Account number is: "+accountNumber);
        System.out.println("available balance is: "+balance);
    }
}
