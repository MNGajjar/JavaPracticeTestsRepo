package may24;

import java.util.Scanner;

public class LargestNumInArray {
    public static int MaxNumInArray(int[] array){

        int maxNum = array[0];
        for (int i = 0; i<array.length;i++){
            if (maxNum<array[i]){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define the size of an Array");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements in Array");
        int[] myArray = new int[arrSize];
        for(int i =0;i< myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println("The largest number from this array is: ");
        int ans = MaxNumInArray(myArray);
        System.out.println(ans);
    }
}
