package may3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Number: ");
        int x = scanner.nextInt();

        if(x%2==0){
            System.out.println("Given Number is Even");
        }else {
            System.out.println("Given Number is Odd");
        }
    }
}
