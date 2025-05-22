package may3;

import java.util.Scanner;

public class Substraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Q: ");
        int q = scanner.nextInt();
        System.out.println("Enter the value of R: ");
        int r = scanner.nextInt();
        int ans = q-r;
        System.out.println("Substraction of given number is: "+ans);
    }
}
