package may10;

import java.util.Scanner;

public class FroLoopEx2 {
    // Print sum from 1 to given number..
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to get sum: ");
        int i = scanner.nextInt();
        int ans = 0;
        for(int j=0;j<=i;j++){
            ans = ans+j;
        }
        System.out.println("Sum from 1 to "+i+" is: "+ans);
    }
}
