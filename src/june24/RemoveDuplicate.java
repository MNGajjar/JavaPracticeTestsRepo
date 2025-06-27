package june24;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,20,40,10,40,35,50);
        System.out.println(list);
        System.out.println("-----------------------------");
        HashSet<Integer> set = new HashSet<>(list); // Storing in just random order
        System.out.println(set);
        System.out.println("-----------------------------");
        TreeSet<Integer> ts = new TreeSet<>(list); // Maintaining natural sort order
        System.out.println(ts);
        System.out.println("-----------------------------");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(list); // Maintaining order of insertion. Like FIFO
        System.out.println(lhs);








     /*   System.out.println("-----------------------------");
        List<String> stringList = Arrays.asList("Maitri","Nisarg","Jaineel","Dimple","NISARG","Maitri");
        System.out.println(stringList);
        System.out.println("-----------------------------");
        HashSet<String> hs = new HashSet<>(stringList);
        System.out.println(hs);
        System.out.println("-----------------------------");
        TreeSet<String> sts = new TreeSet<>(stringList);
        System.out.println(sts);
        System.out.println("-----------------------------");
        LinkedHashSet<String> slhs = new LinkedHashSet<>(stringList);
        System.out.println(slhs);
    }*/
    }
}
