package june17;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int myAge = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        try {
            myAge = scanner.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Last Line.!");

        if(myAge < 18){
            throw new InvalidAgeForVotingException("You are not eligible to Drive.!");
        }else {
            System.out.println("You can get driving License.!");
        }
    }
}
