package practiceEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements of an Array: ");
        int[] myArray = new int[arrSize];
        int i;
        for (i = 0;i<arrSize;i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(myArray));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Index of which element you want to find.?");
        int j = scanner.nextInt();
        if( j == myArray[i]){
            System.out.println("Index of given element is: "+i);
        }
    }
}
