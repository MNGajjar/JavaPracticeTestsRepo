package may17;

public class SwapEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Before Swapping the value of A and B is:");
        System.out.println("a: " +a);
        System.out.println("b: "+b);

        System.out.println("After Swapping the value of A and B is: ");
        temp = b;
        b=a;
        System.out.println("a: " +temp);
        System.out.println("b: "+a);

    }
}
