package practiceEx;

public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1);
        String s3 = new String(s1.toUpperCase());
        System.out.println(s3);
        System.out.println(s1);
    }
}
