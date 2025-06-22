package june21;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {
    public static void main(String[] args) {
        List<EmployeeList> list = new ArrayList<>();
        list.add(new EmployeeList(101,"Maitri",120_000.45));
        list.add(new EmployeeList(102,"Nisarg",250_00.45));
        list.add(new EmployeeList(103,"Khushi",110_000.45));
        list.add(new EmployeeList(104,"Shivani",100_000.45));
        System.out.println(list);

        EmployeeList maxSalary = list.get(0);

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//
//        for (int i = 0; i<list.size();i++){
//            if (list.get(i).getSalary()>maxSalary){
//                maxSalary = list.get(i).getSalary();
//            }
//        }


        /*for (EmployeeList element : list){
            if(element.getSalary() > maxSalary ){
                maxSalary = element.getSalary();
            }
        }*/

    }
}
