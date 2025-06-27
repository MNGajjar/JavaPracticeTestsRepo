package assignment3;

import java.util.Scanner;

public class GroceryStoreMain {
    public static void main(String[] args) {
        GroceryStore.displayInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String searchFruit = scanner.nextLine();
        System.out.println("Enter a weight: ");
        double enterWeight = scanner.nextDouble();
        double price = GroceryStore.calPrice(searchFruit,enterWeight);
        if(searchFruit != null && price > 0){
            System.out.println("Total price of " + enterWeight+ " kgs " +searchFruit+ " is: " + price);
        }else {
            System.out.println("Product not found.!");
        }
     }
}
