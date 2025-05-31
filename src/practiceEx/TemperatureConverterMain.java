package practiceEx;

import java.util.Scanner;

public class TemperatureConverterMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int j = 1;
        do{
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. to Exit");

            int operation;
            do{
                System.out.println("Select your operation: ");
                operation = scanner.nextInt();
            }while (operation < 0 || operation>2);

            if(operation == 0){
                System.out.println("Are you sure.? Press 1. for Exit and 2. for No.");
                int confirm = scanner.nextInt();
                if(confirm == 1){
                    System.exit(0);
                }else {
                    continue;
                }
            }

            System.out.println("Enter Temperature: ");
            double temp = scanner.nextDouble();

            switch (operation){
                case 1:
                    System.out.println("Celsius to fahrenheit is: "+TemperatureConverter.cToF(temp));
                    break;
                case 2:
                    System.out.println("Fahrenheit to Celsius is: "+TemperatureConverter.fToC(temp));
                    break;
                default:
                    System.out.println("Please select valid option.!");
            }
            System.out.println("Yor task is done..want to continue..? 1. yes, 2.No");
            j = scanner.nextInt();
        }while (j == 1);
    }
}
