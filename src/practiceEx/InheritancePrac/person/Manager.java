package practiceEx.InheritancePrac.person;

public class Manager extends Employee{
    String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(department);
    }
}
