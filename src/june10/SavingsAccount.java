package june10;

public class SavingsAccount extends BankAccount{

    @Override
    void deposit(double amount) {
        if(amount >=0 ){
            System.out.println("Amount has been deposited to your account : "+amount);
            System.out.println("Current balance after deposited amount :"+(balance = balance+amount));
        }else {
            System.out.println("Please enter a valid amount");
        }
    }

    @Override
    void withDraw(double withDrawAmount) {
      if(withDrawAmount > 0 && withDrawAmount < balance){
          System.out.println("Withdraw amount is: "+withDrawAmount);
          System.out.println("Current Balance after withdrawing withDrawAmount : "+(balance = balance-withDrawAmount));
      }else {
          System.out.println("Not enough balance");
      }
    }

    public void savingAccountInterest(){
        balance = balance + (balance*0.5);
        System.out.println("Balance after Interest : "+this.balance);
    }

    @Override
    public void displayBalance() {
        savingAccountInterest();
    }
}
