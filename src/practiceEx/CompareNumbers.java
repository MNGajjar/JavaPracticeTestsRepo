package practiceEx;

public class CompareNumbers {

    int x,y;
    double a,b;

    public int compare(int x, int y){
       // System.out.println("Gratest Numbers from given int numbers is: ");
        return Math.max(x,y);
    }

    public double compare(double a, double b){
        //System.out.println("Gratest Numbers from given double numbers is:");
        return Math.max(a,b);
    }

    public double compare(int x, double a){
        //System.out.println("Largest number is: ");
        return Math.max(x,a);
    }

    public void display(){
        System.out.println(compare(10, 0));
        System.out.println(compare(1.1, -1.1));
        System.out.println(compare(1, 1.1));
    }


    public static void main(String[] args) {

        CompareNumbers cn1 = new CompareNumbers();
        cn1.display();


    }

}
