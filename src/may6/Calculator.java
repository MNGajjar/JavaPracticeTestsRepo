package may6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("@@@@@ Perform your Calculation Here..! @@@@@");

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your operation:");
        int operation = scanner.nextInt();

        if(operation==0){
            System.exit(0);
        } else if (operation==1) {
            System.out.println("Enter num1:");
            int num1 = scanner.nextInt();
            System.out.println("enter num2:");
            int num2 = scanner.nextInt();
            int result;
            System.out.println("result is:"+(num1+num2));
        }else if (operation==2) {
            System.out.println("Enter num1:");
            int num1 = scanner.nextInt();
            System.out.println("enter num2:");
            int num2 = scanner.nextInt();
            int result;
            System.out.println("result is:" + (num1 - num2));
        }else if (operation==3) {
            System.out.println("Enter num1:");
            int num1 = scanner.nextInt();
            System.out.println("enter num2:");
            int num2 = scanner.nextInt();
            int result;
            System.out.println("result is:" + (num1 * num2));
        }else if (operation==4) {
            System.out.println("Enter num1:");
            float num1 = scanner.nextFloat();
            System.out.println("enter num2:");
            float num2 = scanner.nextFloat();
            float result;
            System.out.println("result is:" + (num1 / num2));
        }else if (operation==5) {
            System.out.println("Enter num1:");
            float num1 = scanner.nextFloat();
            System.out.println("enter num2:");
            float num2 = scanner.nextFloat();
            float result;
            System.out.println("result is:" + (num1 % num2));
        }else {
            System.out.println("Invalid Selection");
        }
    }
}
