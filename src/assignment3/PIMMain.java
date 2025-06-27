package assignment3;

import java.util.Scanner;

public class PIMMain {
    public static void main(String[] args) {
        ProductInventoryManagement.showDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Search your product: ");
        String serachName = scanner.nextLine();
        double price = ProductInventoryManagement.searchProductByName(serachName);
        if(price>=0){
            System.out.println("Price of "+ serachName + " is: $" +price);
        }else{
            System.out.printf("Product " +serachName + " is not found in given list.!");
        }
    }
}
