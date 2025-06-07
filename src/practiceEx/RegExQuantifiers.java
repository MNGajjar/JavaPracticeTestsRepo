package practiceEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExQuantifiers {
    public static void main(String[] args) {
        System.out.println("Give input:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("M{3}",Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("m",Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("m{2,4}",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        int count = 0;
        int counter = 0;
        int increment = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Total mmm together in given input: "+count);
        while (matcher1.find()){
            counter++;
        }
        System.out.println("Total M: "+counter);

        while (matcher2.find()){
            increment++;
        }
        System.out.println("result is: "+increment);
    }
}
