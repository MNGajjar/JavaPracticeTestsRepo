package may13;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="Dog";
        animal.color="Black";
        animal.height= 3.4f;
        animal.weight = 5;
        animal.eat();
        animal.sleep();
        animal.run();
        animal.walk();
        animal.showDetails();

        System.out.println("-------------------------------------------------------");

        Animal animal2 = new Animal();
        animal2.name = "Giraffe";
        animal2.color = "Brown";
        animal2.height = 10.9f;
        animal2.weight = 15.3f;
        animal2.eat();
        animal2.sleep();
        animal2.walk();
        animal2.run();
        animal2.showDetails();




    }

}
