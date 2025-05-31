package may24;

import java.util.Scanner;

public class ReverseArray {
    public static void revArray(int[] array){

        int startPoint = 0;
        int endPoint = array.length - 1;

        while (startPoint < endPoint){
            int temp = array[startPoint];
            array[startPoint] = array[endPoint];
            array[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define the size of an Array");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements in Array");
        int[] myArray = new int[arrSize];
        for (int i = 0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println("The Array is: ");
        for(int i = 0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        System.out.println("Reverse of this Array is:");
        revArray(myArray);
        for (int i = 0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
