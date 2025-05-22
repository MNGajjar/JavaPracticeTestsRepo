package may17;

public class NameMain {
    public static void main(String[] args) {

        Name name = new Name();
        Name name1 = new Name();

        name.firsName = "Maitree";
        name.middleName = "N.";
        name.lastName = "Gajjar";
        name.displayName();

        System.out.println("--------------------");

        name.firsName = "Khushi";
        name.middleName = "V";
        name.lastName = "Soni";
        name.displayName();

        System.out.println("--------------------");

        name1.firsName = "Jaineel";
        name1.middleName = "D";
        name1.lastName = "Soni";

        name.displayName();
        System.out.println("--------------------");
        name1.displayName();

    }
}
