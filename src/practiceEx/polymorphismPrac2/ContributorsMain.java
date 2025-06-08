package practiceEx.polymorphismPrac2;

public class ContributorsMain {
    public static void main(String[] args) {
        Contributors contributor1 = new Employee("Maitri",890000,2000);
        Contributors contributor2 = new Freelancer("Nisarg",40,73.5);
        Contributors contributor3 = new Volunteer("Khushi");

       /* contributor1.displayInfo();
        contributor2.displayInfo();
        contributor3.displayInfo();
        */

        Contributors[] contributors = {contributor1,contributor2,contributor3};
        for (Contributors con :contributors){
            con.displayInfo();
        }

    }
}
