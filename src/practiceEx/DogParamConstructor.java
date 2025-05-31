package practiceEx;

public class DogParamConstructor {
    String name;
    String color;

    public DogParamConstructor(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void DisplayInfo(){
        System.out.println("Dog name is: "+ this.name + " and color is: " +this.color);
    }

    public static void main(String[] args) {
        DogParamConstructor dog = new DogParamConstructor("Sheru","Brown");
        dog.DisplayInfo();
    }

}
