package may10;

import java.util.Scanner;

public class ForLoopEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find factorial:");
        int x = scanner.nextInt();
        int y;
        int ans=1;
        for(y=1;y<=x;y++){
            ans = ans*y;
        }
        System.out.println("Factorial of given number is: "+ans);
    }
}
