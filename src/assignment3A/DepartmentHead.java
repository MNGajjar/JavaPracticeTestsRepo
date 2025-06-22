package assignment3A;

public class DepartmentHead extends Professor{

    private String officeRoom;

    public DepartmentHead(String name, int age, String employeeID, String department, double salary, String officeRoom) {
        super(name, age, employeeID, department, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Room: "+officeRoom);
    }
}
