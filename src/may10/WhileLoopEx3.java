package may10;

public class WhileLoopEx3 {
    //Print Alphabets from a-z
    public static void main(String[] args) {
        char x = 'a';
        while (x<='z'){
            System.out.println(x++);
        }
        System.out.println("---------------------------------------------------");
        char y = 'A';
        while (y<='Z'){
            System.out.println(y++);
        }
    }
}
