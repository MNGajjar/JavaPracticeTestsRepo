package practiceEx;

import may17.Car;

public class AreaCalcualtion {

    double pi = 3.14;

    public int area(int length, int width){
        return length*width;
    }

    public int area(int side){
        return side*side;
    }

    public double area(double radius){

        return pi*(radius*radius);
    }

    public static void main(String[] args) {
        AreaCalcualtion area = new AreaCalcualtion();
        System.out.println("Circle area: "+area.area(21.1));
        System.out.println("Rectangle area: "+area.area(2, 4));
        System.out.println("Square area: "+area.area(4, 4));
    }
}
