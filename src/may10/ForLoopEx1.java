package may10;

import java.util.Scanner;

public class ForLoopEx1 {
    //ask user to set limit to print digits from 1 to n..
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to set Limit: ");
        int i = scanner.nextInt();
        for (int j = 1; j<=i;j++){
            System.out.println(j);
        }


    }
}
