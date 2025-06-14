package practiceEx;


import java.util.Scanner;

// Find max and min from the array list
public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter the size of an array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the elements in array: ");
        int numbers[] = new int[arrSize];

        for (int i = 0; i<arrSize;i++){
            numbers[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]> max){
                max = numbers[i];
            }
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Max no in Array: "+max);
        System.out.println("Min no in Array: "+min);

    }

}
