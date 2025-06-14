package practiceEx;


import java.util.Scanner;

// count positive, negative, and 0s in array
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the +ve, -ve and some 0s in Array: ");
        int[] myArray = new int[arrSize];

        for (int i = 0;i<arrSize;i++){
            myArray[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0 ; i<myArray.length;i++){
            if(myArray[i] > 0){
                positiveCount++;
            }else if(myArray[i] < 0){
                negativeCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.println("Total Positive No in Array: "+positiveCount);
        System.out.println("Total Negative No in Array: "+negativeCount);
        System.out.println("Total Zero in Array: "+zeroCount);
    }
}
