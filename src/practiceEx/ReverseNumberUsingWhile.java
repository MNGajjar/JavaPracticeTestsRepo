package practiceEx;

import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class ReverseNumberUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get reverse series: ");
        int x = scanner.nextInt();
        int ans=x;
        while (ans>=0){
            System.out.println(ans);
            ans--;
        }
    }
}
