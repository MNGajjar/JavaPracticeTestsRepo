package may10;

import java.util.Scanner;

public class FroLoopEx4 {
    // Print table of given Number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int i = scanner.nextInt();
        int ans;
        for(int j = 1; j<=10; j++){
            ans = j*i;
            System.out.println(i +" * " +j +" = " +ans);
        }
    }
}
