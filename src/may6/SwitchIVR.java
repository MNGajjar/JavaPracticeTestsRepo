package may6;

import java.util.Scanner;

public class SwitchIVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your IVR option");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("0. Exit");

        System.out.println("Select your option:");
        int option = scanner.nextInt();


        if (option==0){
            System.exit(0);
        }else {
            switch (option){
                case 1:
                    System.out.println("You will get instruction in English");
                    System.out.println("What is your Query regarding.?");
                    System.out.println("1. Technical Support");
                    System.out.println("2. Billing info");
                    System.out.println("3. Sales info");
                    int help = scanner.nextInt();
                    switch (help){
                        case 1:
                            System.out.println("Thanks for contacting Technical Support");
                            break;
                        case 2:
                            System.out.println("Hope you get clear information about your bills");
                            break;
                        case 3:
                            System.out.println("Thanks for connecting to the sales team");
                            break;
                        default:
                            System.out.println("Have a great day");
                    }
                    break;

                case 2:
                    System.out.println("You will get instruction in French");
                    System.out.println("De quoi porte votre question ?");
                    System.out.println("1. Support technique");
                    System.out.println("2. Informations de facturation");
                    System.out.println("3.  Informations de Ventes");
                    int aide = scanner.nextInt();

                    switch (aide){
                        case 1:
                            System.out.println("Merci de contacter le support technique");
                            break;
                        case 2:
                            System.out.println("J'espère que vous obtiendrez des informations claires sur vos factures.");
                            break;
                        case 3:
                            System.out.println("Merci de vous être connecté à l'équipe des ventes.");
                            break;
                        default:
                            System.out.println("Bonne journée.!");
                    }
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        }

    }
}
