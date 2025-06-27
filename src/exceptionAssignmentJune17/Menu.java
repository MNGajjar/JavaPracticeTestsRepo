package exceptionAssignmentJune17;

import java.util.Scanner;

/*
Create a menu Suppose you have balance 100, given menu items in Grocery,
 User should be able to enter the item with code A, B etc
 if it is valid item, it will added to the total.
 A - 19.99 B - 20.99 C - 15.99 D - 30.99 E - 40.99*/
public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double myBalance = 100;
        double total = 0;
        double price;

        while (true) {
            System.out.println("Select from this List: ");
            System.out.println("1. Bread - $19.99");
            System.out.println("2. Fruits - $20.99");
            System.out.println("3. Vegetables - $15.99");
            System.out.println("4. Dairy Products - $30.99");
            System.out.println("5. Frozen Food - $40.99");
            System.out.println("0. Exit");
            int mySelection = scanner.nextInt();
            if (mySelection == 0) {
                System.exit(0);
                break;
            }

            switch (mySelection) {
                case 1:
                    price = 19.99;
                    break;
                case 2:
                    price = 20.99;
                    break;
                case 3:
                    price = 15.99;
                    break;
                case 4:
                    price = 30.99;
                    break;
                case 5:
                    price = 40.99;
                    break;
                default:
                    System.out.println("Invalid Selection.!");
                    continue;
            }

            try {
                if (total + price > myBalance) {
                    throw new InsufficientBalanceException("Insufficient Balance");
                }
                total = total + price;
                System.out.println("Item Added and Total available balance is: " + (myBalance - total));
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }

    }
}