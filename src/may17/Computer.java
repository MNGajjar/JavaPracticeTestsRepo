package may17;

public class Computer {
    String brand;
    int capacity;

    public Computer() {
        System.out.println("Hello World.!");
    }

    public Computer(String brand) {
        //this();
        this("Hp",128);
        this.brand = brand;
        System.out.println("Hello Pragra.!");
    }

    public Computer(String brand, int capacity) {
        //this("Hp");
        this();
        this.brand = brand;
        this.capacity = capacity;
        System.out.println("Hello Students.!");
    }

    public void show(){
        System.out.println(brand);
        System.out.println(capacity);
    }

}

