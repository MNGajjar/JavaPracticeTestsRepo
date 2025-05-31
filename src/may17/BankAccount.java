package may17;

import java.util.Scanner;

public class BankAccount {

    Scanner scanner = new Scanner(System.in);

    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double balance){
        if (balance<=0){
            System.out.println("you are not allowed to deposit -ve amount or 0.!");
        }else {
            //System.out.println("Amount deposited is:");
            this.balance = this.balance + balance;
        }
    }

    public void withDraw(double amount) {
        if (amount <=0) {
            System.out.println("You are not allowed to withdraw -ve amount or 0.!");
            return;
        }
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Remaining Balance after withdrawal: " + balance);
        } else {
            System.out.println("Not enough Money to withdraw :(");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Holder's Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}


/// Home Assignment....!