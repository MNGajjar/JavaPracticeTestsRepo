package practiceEx.InheritancePrac.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John",30);
        Employee emp = new Employee("Alice",28,50000);
        Manager manager = new Manager("Bob",35,70000,"HR");

        person.display();
        System.out.println("-----------");
        emp.display();
        System.out.println("-----------");
        manager.display();

    }

}
