package may31;

import java.util.Scanner;

public class StringMethodsPracUsingMethod {

    int digit = 0;
    int letter = 0;
    int whiteSpace = 0;
    String userString;

    public void StringMethodEx(String myString){
        Scanner scanner = new Scanner(System.in);
        userString = scanner.nextLine();
        for(int i = 0;i<userString.length();i++) {
            char s1Char = userString.charAt(i);
            if (Character.isLetter(s1Char)) {
                letter++;
            } else if (Character.isDigit(s1Char)) {
                digit++;
            } else if (Character.isWhitespace(s1Char)) {
                whiteSpace++;
            }
        }
    }

    public void ShowDetail(){
        System.out.println("Total Characters in String: "+userString.length());
        System.out.println("Total words is String: "+userString.split(" ").length);
        System.out.println("Digits in String: "+digit);
        System.out.println("Letters in String: "+letter);
        System.out.println("WhiteSpace in String: "+whiteSpace);
    }

}
