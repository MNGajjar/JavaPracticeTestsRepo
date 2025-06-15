package june14.interFaceEx;

public class Test {
    public static void main(String[] args) {
        method2();
    }

    public static void method1(){
        method2();
    }
    public static void method2(){
        method1();
    }
}
