package may10;

import java.util.Scanner;

public class DoWhileEx2 {
    //Sum of given Number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int x = scanner.nextInt();
        int y = 0;
        int ans = 0;
        do{
            ans = ans + y;
            y++;
        }while (y<=x);
        System.out.println("Sum from 1 to " +x+" is: "+ans);
    }
}
