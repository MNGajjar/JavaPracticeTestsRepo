package practiceEx;

public class ConstructorChaining {

    String name;
    int age;

    public ConstructorChaining(){
        this("Unknown",10);
    }

    public ConstructorChaining(String name, int age){
        this.name = name;
        this.age =age;
    }

    public void Display(){
        System.out.println("Name is: "+name + " Age is: "+age);
    }

}
