package may10;

import java.util.Scanner;

public class WhileLoopEx1 {
    public static void main(String[] args) {
        //Ask user to enter number where they want to end loop...like from 1 to where.. 1 to 10 , 1 to 4, 1to 5...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = scanner.nextInt();
        int y=1;
        while (y<=x){
            System.out.println(y);
            y++;
        }
    }
}
