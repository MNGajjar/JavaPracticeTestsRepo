package may3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Calender Year: ");
        int x = scanner.nextInt();
        if(x%4==0 && (x%400==0 && !(x%100==0))){
            System.out.println("Given year is Leap year");
        }else {
            System.out.println("Given year is not leap year");
        }
    }
}
