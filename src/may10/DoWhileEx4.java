package may10;

import java.util.Scanner;

public class DoWhileEx4 {
    // print table of given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        float x = scanner.nextFloat();
        float ans;
        float y = 1;
        do{
            ans = x*y;
            System.out.println(x+" * "+y+" = "+ans);
            y++;
        }while (y<=10);

    }
}
