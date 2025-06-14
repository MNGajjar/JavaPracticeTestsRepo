package practiceEx;

import java.util.Scanner;

// reverse the given array and print that one
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements of an Array: ");
        int[] myArray = new int[arrSize];
        for (int i = 0; i < arrSize; i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println("Array before reverse.!");
        for (int i =0 ; i< myArray.length;i++){
            System.out.println(myArray[i]);
        }
        System.out.println("Array after reverse.!");
        for (int i = myArray.length - 1 ; i>=0;i--){
            System.out.println(myArray[i]);
        }
    }
}
