package june03;

public class PaymentMain {
    public static void main(String[] args) {

        Payment payment = new ApplePay();
        Payment payment1 = new DebitCard();
        Payment payment2 = new PayPal();
        Payment payment3 = new SamsungPay();

        payment.pay();
        System.out.println("------------------------------------------");
        payment1.pay();
        System.out.println("------------------------------------------");
        payment2.pay();
        System.out.println("------------------------------------------");
        payment3.pay();

    }
}
