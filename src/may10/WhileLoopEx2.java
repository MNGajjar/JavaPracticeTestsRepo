package may10;

import java.util.Scanner;

public class WhileLoopEx2 {
    public static void main(String[] args) {
        //Print the sum of n numbers..Ask user to add number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number:");
        int x = scanner.nextInt();
        int y=0;
        int ans = 0;

        while (y<=x){
            ans = ans+y;
            y++;
        }
        System.out.println(ans);
    }
}
