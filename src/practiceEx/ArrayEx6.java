package practiceEx;


import java.util.Scanner;

//Find the element which is greater then 3
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the element of an Array: ");
        int[] myArray = new int[arrSize];
        for (int i = 0;i<arrSize;i++){
            myArray[i] = scanner.nextInt();
        }
        for (int i = 0;i<arrSize;i++){
            if (myArray[i]> 3){
                System.out.println("Numbers greater then 3 in Array at the index of: "+i +" --> "+myArray[i]);
            }
        }
    }
}
