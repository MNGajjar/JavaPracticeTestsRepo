package may3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the value of Num2: ");
        int num2 = scanner.nextInt();
        int ans = num1+num2;
        System.out.println("Sum of two given number is: "+ans);
    }
}
