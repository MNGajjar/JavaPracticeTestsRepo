package may10;

import java.awt.*;
import java.util.Scanner;

public class CalculatorUsingWhileLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Welcome to Calculator--------");
        int j=1;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");

            int operation;
            do {
                System.out.println("Choose you Operation from above List..!");
                operation = scanner.nextInt();
            } while (operation < 0 || operation > 5);
            if (operation == 0) {
                System.out.println("Are you Sure.? Press 1. for Yes 2. for No....");
                int confirm = scanner.nextInt();
                if (confirm == 1) {
                    System.exit(0);
                }else {
                    continue;
                }
            }
            System.out.println("Enter Your num1.");
            float num1 = scanner.nextFloat();
            System.out.println("Enter your num2.");
            float num2 = scanner.nextFloat();

            switch (operation) {
                case 1:
                    System.out.println("Addition of given number is:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Substraction of given number is:" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication of given number is:" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division of given number is:" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Division of given number is:" + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid Selection.! :( Select from given options only.!");
                    break;
            }
            System.out.println("Your selection has been performed.! Do yoy still want to continue.? Select 1. for yes 2. for exit");
            j = scanner.nextInt();
        } while (j == 1);
    }
}