package may17;

public class CarMain {
    public static void main(String[] args){
        Car car = new Car();
        Car car1 = new Car("Civic");
        Car car2 = new Car("Civic","Honda");
        Car car3 = new Car("Civic","Honda","Petrol");
        Car car4 = new Car("Civic","Honda","Petrol","Black");
        Car car5 = new Car("Civic","Honda","Diesel","Black",95);

        car.display();
        System.out.println("------------------------------------");
        car1.display();
        System.out.println("------------------------------------");
        car2.display();
        System.out.println("------------------------------------");
        car3.display();
        System.out.println("------------------------------------");
        car4.display();
        System.out.println("------------------------------------");
        car5.display();

    }
}
