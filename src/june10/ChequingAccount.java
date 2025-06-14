package june10;

public class ChequingAccount extends BankAccount{

    @Override
    void deposit(double amount) {
        if(amount >=0 ){
            System.out.println("Amount has been deposited to your account: "+ amount);
            System.out.println("Current balance after deposited amount : "+(balance = balance+amount));
        }else {
            System.out.println("Please enter a valid amount");
        }
    }

    @Override
    void withDraw(double amount) {
        if(amount < balance){
            System.out.println("Total withdraw amount is: "+amount);
            System.out.println("Current Balance after withdrawing amount :"+(balance = balance-amount));
        }else {
            System.out.println("Not enough balance");
        }
    }
}
