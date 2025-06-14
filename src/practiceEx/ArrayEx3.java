package practiceEx;


import java.util.Scanner;

// Print each number from array using for each loop
public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int arraySize = scanner.nextInt();
        System.out.println("Enter elements in Array: ");
        int[] myArray = new int[arraySize];
        for (int i = 0;i<arraySize;i++){
            myArray[i] = scanner.nextInt();
        }
        for(int num : myArray){
            System.out.println("Elements in Array: "+num);
        }
    }
}
