package practiceEx.InheritancePrac.construcorChaining;

public class Car extends Vehicle{

    String model;

    public Car(String type, String model) {
        super(type);
        this.model = model;
        System.out.println("Model of the car is: "+model);
    }

}
