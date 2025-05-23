package practiceEx;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce(){
        System.out.println("Hello..My Name is: "+this.name);
    }
}

