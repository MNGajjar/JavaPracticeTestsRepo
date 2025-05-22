package may6;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from this operations");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        System.out.println("0. Exit");

        System.out.println("Enter your Calculation Option: ");
        int input = scanner.nextInt();
        if (input == 0) {
            System.exit(0);
        }else {
            System.out.println("Enter num1: ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter num2");
            float num2 = scanner.nextFloat();

            switch (input) {
                case 1:
                    System.out.println("Your ans is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Your ans is: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Your ans is: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Your ans is: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Your ans is: " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid Selection.!");
            }
        }
    }
}
