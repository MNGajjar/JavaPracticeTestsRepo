package practiceEx;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int arrSize = scanner.nextInt();
        System.out.println("Enter the names in array: ");
        String[] names = new String[arrSize];

        for (int i = 0 ; i < arrSize ; i++){
            names[i] = scanner.next();
        }

        for (int i = 0;i<arrSize;i++){
            System.out.println("Names present in Array: "+names[i]);
        }
    }
}
