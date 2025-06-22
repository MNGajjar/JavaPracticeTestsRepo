package june21;

public class BoxMain {
    public static void main(String[] args) {
        Box<String, Integer> item1 = new Box<>("Pens",25);
        Box<Integer,String> item2 = new Box<>(10,"Pencils");
        Box<Double,Integer> item3 = new Box<>(10.3,5);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
    }
}
