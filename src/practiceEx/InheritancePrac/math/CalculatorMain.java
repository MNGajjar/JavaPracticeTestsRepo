package practiceEx.InheritancePrac.math;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(cal.sum(27, 16));
        System.out.println(cal.sum(1, 2, 3));
        System.out.println(advancedCalculator.sum(3, 3));
    }
}
