package practiceEx.encapsulationPrac;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("M1234","MaitriG",72000.99);
        BankAccount bankAccount1 = new BankAccount("K1234","Khushi",78000.89);
        bankAccount.accountCount();
        bankAccount.display();
        bankAccount.deposit(500);
        bankAccount.withdraw(725);
        System.out.println("------------------------------------------");
        System.out.println(bankAccount.getAccountHolderName());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println("------------------------------------------");
        bankAccount1.display();;
        bankAccount1.deposit(50);
    }
}
