package assignment3;

/*
Product Inventory Management:
You are managing an inventory system for an online store.
Create a Java program that uses an array to store the names of 5 products
and another array to store their corresponding prices.
Write a function that:
• Displays all products with their prices.
• Allows the user to search for a product by name and retrieve its price.
*/

public class ProductInventoryManagement {

        private static final String[] productName = {"iPhone", "airPods", "charger", "iWatch", "macBook"};
        private static double[] productPrice = {1500.99,399.99,75.99,899.99,2399.99};

        public static void showDetails(){
            System.out.println("Product List: ");
            for (int i = 0; i< productName.length;i++){
                System.out.println((i+1)+ "."+ productName[i] + " - $" + productPrice[i]);
            }
        }

        public static double searchProductByName(String name){
            for (int i = 0; i<productName.length;i++){
                if(productName[i].equalsIgnoreCase(name)){
                    return productPrice[i];
                }
            }return -1;
        }
}
