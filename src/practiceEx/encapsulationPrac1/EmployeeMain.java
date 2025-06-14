package practiceEx.encapsulationPrac1;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee(101,"Maitri Gajjar", 5000);

        System.out.println("Name of the Employee is: "+employee.getName());
        System.out.println("Employee Id: "+employee.getId());
        employee.setSalary(15000.27);
        System.out.println("Employee Monthly salary is: "+employee.getSalary());
        System.out.println("Annual salary of the employee is: "+employee.calculateAnnualSalary());

        Employee employee1 = new Employee(102,"N Gajjar", 35000.35);
        System.out.println("Employee Details: "+employee1.toString());

    }
}
