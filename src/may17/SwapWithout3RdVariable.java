package may17;

public class SwapWithout3RdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Value of A and B before Swapping is:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println("Value of A and B after Swapping is:");
        b=b-a;
        a=b+a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
}
