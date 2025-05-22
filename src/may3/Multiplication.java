package may3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y:");
        int y = scanner.nextInt();
        int ans = x*y;
        System.out.println("The Multiplication of given two number is: "+ans);
    }
}
