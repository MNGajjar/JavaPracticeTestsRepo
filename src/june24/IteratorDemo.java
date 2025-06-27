package june24;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maitree");
        names.add("Nisarg");
        names.add("Khushbu");
        names.add("Vrunda");
        names.add("Trisha");
/*

        List<String> unmodifiableList = Collections.unmodifiableList(names);
        Iterator<String> stringIterator = unmodifiableList.iterator();

        while (stringIterator.hasNext()){
            String next  = stringIterator.next();
            if (next.equals("Trisha")){
                stringIterator.remove();
            }
        }
        System.out.println(names);
*/

        Iterator<String> iterator = names.iterator();
/*
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("Trisha")){
                iterator.remove();
            }
        }
        System.out.println(names);
*/
    }
}
