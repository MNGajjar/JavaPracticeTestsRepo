package may27;

import java.util.Scanner;

public class StringPalindromeEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a palindrome:");
        String myString = scanner.nextLine();
        int start = 0;
        int end = myString.length()-1;
        boolean ans = true;
        while (start < end){
            if(myString.charAt(start) != myString.charAt(end)){
                ans = false;
                break;
            }
            start++;
            end--;
        }
        if (ans){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
