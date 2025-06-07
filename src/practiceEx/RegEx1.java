package practiceEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        System.out.println("Give any input..");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Pattern pattern1 = Pattern.compile("[^a-z]");
        Pattern pattern2 = Pattern.compile("[a-i[1-5]]");
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        boolean result = matcher.find();
        boolean result1 = matcher1.find();
        boolean result2 = matcher2.find();
        if(result){
            System.out.println("Match found.!");
        }else {
            System.out.println("Match not found.!");
        }
        System.out.println(result1);
        System.out.println(result2);
    }
}
