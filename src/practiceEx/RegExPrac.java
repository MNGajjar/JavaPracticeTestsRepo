package practiceEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPrac {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Maitri",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello, maitri Here..!");
        boolean result = matcher.find();

        if(result){
            System.out.println("Match found.!");
        }else {
            System.out.println("Match not found.!");
        }
    }
}
