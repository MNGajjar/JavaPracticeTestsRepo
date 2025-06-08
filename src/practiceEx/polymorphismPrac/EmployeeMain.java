package practiceEx.polymorphismPrac;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Maitri",89000.99);
        Employee emp2 = new PartTimeEmployee("Khushi",40,35.25);
        Employee emp3 = new Intern("Nisarg",10000.99);
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
