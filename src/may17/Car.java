package may17;

public class Car {
    String name;
    String brand;
    String engineType;
    String color;
    int hp;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String brand) {
        this.name=name;
        this.brand=brand;
    }

    public Car(String name, String brand, String engineType) {
        this.name=name;
        this.brand=brand;
        this.engineType = engineType;
    }

    public Car(String name, String brand, String engineType, String color) {
        this.name=name;
        this.brand=brand;
        this.engineType = engineType;
        this.color=color;
    }

    public Car(String name, String brand, String engineType, String color, int hp) {
        this.name=name;
        this.brand=brand;
        this.engineType = engineType;
        this.color=color;
        this.hp=hp;
    }

public void display(){
    System.out.println(name);
    System.out.println(brand);
    System.out.println(engineType);
    System.out.println(color);
    System.out.println(hp);
    }

}