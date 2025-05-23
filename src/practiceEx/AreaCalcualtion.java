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
        AreaCalcualtion areaRectangle = new AreaCalcualtion();
        System.out.println("Area of rectangle is: "+areaRectangle.area(21, 2));
        AreaCalcualtion areaSquare = new AreaCalcualtion();
        System.out.println("Area of Square is: "+areaSquare.area(4));
        AreaCalcualtion areaCircle = new AreaCalcualtion();
        System.out.println("Area of Circle is: "+areaCircle.area(4.2));
    }
}
