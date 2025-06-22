package assignment3A;

public class UniversityMain {
    public static void main(String[] args) {
        University.setUniversityName("Global Tech University");
        Person[] people = new Person[3];
        people[0] = new Student("Alice Smith",20,"S12345","Computer Science",3.9);
        people[1] = new Professor("Dr.John Doe",45,"P67890","Software Engineering",95000.00);
        people[2] = new DepartmentHead("Sarah Lee", 50,"P98765","Computer Science",120000.00,"A-105");

        for (int i = 0;i < people.length;i++){
            people[i].displayInfo();
        }
        System.out.println("-----------------------------------------");
        System.out.println(University.getStatics());
    }
}
