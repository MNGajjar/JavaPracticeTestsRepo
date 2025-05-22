package may3;

import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int a = scanner.nextInt();
        if(a<0){
            System.out.println("Given Number is negative");
        }else {
            System.out.println("Given Number is positive");
        }
    }
}
