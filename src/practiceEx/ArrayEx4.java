package practiceEx;


import java.util.Scanner;

//Print even and odd numbers from the given array list:
public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements of an Array: ");
        int myArray[] = new int[arrSize];
        for (int i = 0; i<arrSize;i++){
             myArray[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < arrSize ; i++){
            if(myArray[i]%2 == 0){
                System.out.println("Even Num in Array: "+myArray[i]);
            }else {
                System.out.println("Odd Num in Array: "+myArray[i]);
            }
        }
    }

}
