package may3;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.println("Enter the value of N: ");
        int n = scanner.nextInt();
        float ans = m%n;
        System.out.println("Modulus of given no is: "+ans);
    }
}
