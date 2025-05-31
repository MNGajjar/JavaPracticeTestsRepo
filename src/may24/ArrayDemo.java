package may24;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Define a size of an Array..");
        int arrSize = scanner.nextInt();

        System.out.println("Enter an element into the Array..");
        int[] myArray = new int[arrSize];

        for(int i=0 ; i<myArray.length ; i++){
            myArray[i]= scanner.nextInt();
        }

        System.out.println("Printing the elements..");
        for (int i = 0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
