package practiceEx;


import java.util.Scanner;

//Print the sum of all given numbers in Array:
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements of an Array: ");
        int[] myArray = new int[arrSize];
        for (int i = 0; i<arrSize;i++){
            myArray[i] = scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i<myArray.length;i++){
            sum = myArray[i]+sum;
        }
        System.out.println("Sum of the given elements in array: "+sum);
    }
}
