package practiceEx;

import java.util.Scanner;

public class TemperatureConverter {


    public static double cToF(double celsius){

        double f = (celsius*9/5)+32;
        return f;
    }

    public static double fToC(double fahrenheit){
        double c = (fahrenheit - 32) * 5/9;
        return c;
    }

}
