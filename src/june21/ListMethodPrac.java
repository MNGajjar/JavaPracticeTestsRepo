package june21;

import java.util.ArrayList;
import java.util.List;

public class ListMethodPrac {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Maitri");
        list1.add("Books");
        list1.add(2,"String on 2nd Index");
        System.out.println(list1);
        System.out.println(list1.get(2));
        list1.remove(2);
        System.out.println(list1);
        list1.add("String 3");
        list1.add("String 4");
        list1.add("String 5");
        System.out.println(list1);
        System.out.println(list1.subList(1,3)); // will print o/p from 1st index to 2nd index
        System.out.println(list1.set(4, "MyString5"));
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
