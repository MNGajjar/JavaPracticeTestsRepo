package practiceEx.InheritancePrac.person;

public class Employee extends Person{
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

}
