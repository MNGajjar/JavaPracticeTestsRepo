package may13;

public class Animal {

    String name;
    String color;
    float weight;
    float height;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void run(){
        System.out.println("Animal is running");
    }

    public void walk(){
        System.out.println("Animal is walking");
    }

    public void showDetails(){
        System.out.println("Name : " +name);
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
        System.out.println("Height : "+height);
    }

}