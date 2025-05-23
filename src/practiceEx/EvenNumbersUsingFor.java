package practiceEx;

public class EvenNumbersUsingFor {
    public static void main(String[] args) {
        int i;
        System.out.println("Even Numbers from 1 to 100");
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}