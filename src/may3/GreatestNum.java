package may3;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of X:");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y:");
        int y = scanner.nextInt();
        System.out.println("Enter the value of Z:");
        int z = scanner.nextInt();
        /*int x=20;
        int y=65;
        int z=57;*/
        if(x>y && x>z){
            System.out.println("x is greater");
        }else if(y>z){
            System.out.println("Y is greater");
        } else{
            System.out.println("z is greater");
        }
    }
}
