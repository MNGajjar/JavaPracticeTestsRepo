package practiceEx;

public class AddMethodOverloading {

    public static int add (int x, int y){
        return x+y;
    }

    public static double add(int x, int y, double z){
        return x+y+z;
    }

    public static double add(double x ,double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(add(12, 2));
        System.out.println(add(2, 1, 1));
        System.out.println(add(23.2, 1.2));
    }
}
