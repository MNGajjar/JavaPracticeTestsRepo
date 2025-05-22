package may10;

import java.util.Scanner;

public class WhileLoopEx4 {
    // Print table of 5 / or ask user to enter number to get table of that number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to get table of that..!");
        int x = scanner.nextInt();
        int y = 1;
        int ans;
        while (y<=10){
            ans = x * y;
            System.out.println(x +" * "+y+" = "+ans);
            y++;
        }
    }
}
