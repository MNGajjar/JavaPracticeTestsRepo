package practiceEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMetaChar {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\bgajjar\\b",Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("\\d1");
        Pattern pattern2 = Pattern.compile("java|.net",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        boolean result = matcher.find();
        boolean result1 = matcher1.find();
        boolean result2 = matcher2.find();
        if(result){
            System.out.println("Pattern Found");
        }else {
            System.out.println("Pattern not found");
        }
        System.out.println(result1);
        System.out.println(result2);
    }
}
