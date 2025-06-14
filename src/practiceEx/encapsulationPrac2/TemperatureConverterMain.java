package practiceEx.encapsulationPrac2;

import java.util.Scanner;

public class TemperatureConverterMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("Enter your Temperature: ");
        tc.setCelcius(scanner.nextDouble());
        System.out.println(tc.toString());
    }

}
