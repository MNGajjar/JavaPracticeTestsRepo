package may3;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scanner.nextInt();
        int ans = a/b;
        System.out.println("Division of given two no is: "+ans);
    }
}
