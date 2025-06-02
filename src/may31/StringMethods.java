package may31;

import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        String doc = "The class # String includes sunny@pragra123.io methods, for examining individual characters of the sequence";
        //count the words and characters from this String.

        System.out.println("Total char in string with space is: "+doc.length());
        System.out.println("Total Characters in given String without space is: "+doc.replace(" ","").length());
        String[] words = doc.split(" ");
        System.out.println("Total words in this String is: "+words.length);

        int count = 0;
        for (int i = 0;i<doc.length();i++){
            char charDoc = doc.charAt(i);
            if(Character.isWhitespace(charDoc)){
                count++;
            }
        }
        System.out.println("Total spaces in the string is: : "+count);

        int letter = 0;
        for (int i = 0;i<doc.length();i++){
            char letterDoc = doc.charAt(i);
            if(Character.isLetter(letterDoc)){
                letter++;
            }
        }
        System.out.println("Letters in String: "+letter);

        int digit = 0;
        for(int i = 0;i<doc.length();i++){
            char digitDoc = doc.charAt(i);
            if(Character.isDigit(digitDoc)){
                digit++;
            }
        }
        System.out.println("Total digits is String: "+digit);

        //training@pragra.io find username from this String

        String userName = "training@pragra.io";
        int index = userName.indexOf("@");
        String subString = userName.substring(0,index);
        System.out.println("UserName from this String is: "+subString);

        System.out.println("------------------------------------------------------------");

        String s1 = "Hello, I am learning java123 at pragra and you can reach to them at training@pragra.io";
        //find character with space and without space, letter,words,digits,whitespaces, and userName if there is any.

        System.out.println("Total length of String: "+s1.length());

        System.out.println("Total Characters in String: "+s1.replace(" ","").length());

        System.out.println("Total words in String: "+s1.split(" ").length);

        int digit1 = 0;
        int letter1 = 0;
        int whiteSpace = 0;
        int index1 = 0;
        for(int i = 0;i<s1.length();i++) {
            char s1Char = s1.charAt(i);
            if (Character.isLetter(s1Char)) {
                letter1++;
            } else if (Character.isDigit(s1Char)) {
                digit1++;
            } else if (Character.isWhitespace(s1Char)) {
                whiteSpace++;
            }
        }

        System.out.println("Letters in String: " +letter1);
        System.out.println("Digits in String: " + digit1);
        System.out.println("WhiteSpace in String: " + whiteSpace);

        System.out.println("------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String myString = scanner.nextLine();
        System.out.println("Total characters in your String is: "+myString.length());
        String[] wordString = myString.split(" ");
        System.out.println("Total words in your String is: "+wordString.length);
        int whiteSpace1 = 0;
        int digit2 = 0;
        int letter2 = 0;
        for(int i = 0;i<myString.length();i++){
            char charString = myString.charAt(i);
            if(Character.isWhitespace(charString)){
                whiteSpace1++;
            } else if (Character.isDigit(charString)) {
                digit2++;
            }else if (Character.isLetter(charString)){
                letter2++;
            }
        }
        System.out.println("WhiteSpaces in your String is: "+whiteSpace1);
        System.out.println("Letters in your String is: "+letter2);
        System.out.println("Digits in your String is: "+digit2);

 /*       char[] myDoc = doc.toCharArray();
        System.out.println((myDoc.length));
        //System.out.println(doc.trim());
        String trimDoc = doc.trim();
        System.out.println(trimDoc.replace(" ", ""));
        System.out.println(trimDoc.length());
        String[] wordsDoc = doc.split(doc);
*/
/*
        System.out.println("----------------------------------");

        String s = "Hello I am learning java 123";
        for (int i = 0;i< s.length();i++){
            char character = s.charAt(i);
            if(Character.isDigit(character)){
                System.out.println("digit in this string at the index of: "+i);
            }
        }

        System.out.println("-----------------------------------");

        //ask user to enter a string and find username in that string.

        String userName = "training@pragra.io";
        int index = userName.indexOf("@");
        String subString = userName.substring(0,index);
        System.out.println(subString);
  */  }
}
