package practiceEx;

public class CatDefalutConstructor {

    String name;
    int age;

    public CatDefalutConstructor() {
        name = "Unknown";
        age = 0;
    }

    public static void main(String[] args) {
        CatDefalutConstructor cat = new CatDefalutConstructor();
        System.out.println(cat.name);
        System.out.println(cat.age);
    }
}
