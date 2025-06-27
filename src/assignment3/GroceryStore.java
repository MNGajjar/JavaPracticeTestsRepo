package assignment3;

/*
Grocery Store Price Calculator:
You are working at a grocery store that offers 5 different fruits.
Create a Java program that:
• Uses two arrays:
one for storing the names of fruits and another for storing their prices per kilogram.
• Allows the user to input the fruit name and the number of kilograms they want to purchase,
then calculates and prints the total price.
*/

public class GroceryStore {

    private static String[] fruits = {"Apple","Kiwi","Strawberry","Watermelon","Orange"};
    private static double[] price = {6.99,2.99,4.99,3.97,1.99};

    public static void displayInfo(){
        System.out.println("Product name and weight in KGs: ");
        for (int i = 0;i<fruits.length;i++){
            System.out.println((i+1)+". "+fruits[i]+" - $"+price[i]);
        }
    }

    public static double calPrice(String fruitName, double weightInKG){
        for (int i = 0 ; i < fruits.length;i++){
            if (fruits[i].equalsIgnoreCase(fruitName) && price[i]>0){
                return price[i] = price[i] * weightInKG;
            }
        }return -1;
    }

}
