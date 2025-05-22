package may10;

import java.util.Scanner;

public class DoWhileEx1 {
    // print numbers from 1 to limit of user's number using DoWhile...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Limit");
        int x = scanner.nextInt();
        int y=1;
        do{
            System.out.println(y);
            y++;
        }while (y<=x);
    }

}
