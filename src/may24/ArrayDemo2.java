package may24;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of an Array");
        int arrSize = scanner.nextInt();

        System.out.println("Enter name of the Student's in to the Array..");
        String[] studentArray = new String[arrSize];

        for(int i=0;i<studentArray.length;i++){
            studentArray[i] = scanner.next();
        }
        for (int i=0;i<studentArray.length;i++){
            System.out.println(studentArray[i]);
        }
    }
}
