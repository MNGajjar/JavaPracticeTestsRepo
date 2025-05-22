package may17;

public class Name {

    String firsName;
    String middleName;
    String lastName;

    public String name(String firstName){
        return firstName;
    }

    public String name(String firstName, String middleName){
        return firstName+middleName;
    }

    public String name(String firstName, String middleName, String lastName){
        return firstName+middleName+lastName;
    }

    public void displayName(){
        System.out.println(firsName);
        System.out.println(middleName);
        System.out.println(lastName);
    }
}
