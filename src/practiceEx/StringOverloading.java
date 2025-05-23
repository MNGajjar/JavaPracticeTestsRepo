package practiceEx;

public class StringOverloading {

    public static String concatenate(String a, String b){
        return a+b;
    }
    public static String concatenate(String a,String b, String c){
        return a+b+c;
    }
    public static String concatenate(String a,int x){
        return a+x;
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Hello"," World..!"));
        System.out.println(concatenate("Good ","Evening ","Maitree"));
        System.out.println(concatenate("Seven",11));
    }
}
