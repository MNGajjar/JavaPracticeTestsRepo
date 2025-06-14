package practiceEx;


import java.util.Scanner;

// Washing Machine load balancer Challenge.!
public class WMC {

    public static void main(String[] args) {
        int totalNoOfMachines = 3;
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter load in Machine 1: ");
        a = scanner.nextInt();
        System.out.println("Enter load in Machine 2: ");
        b = scanner.nextInt();
        System.out.println("Enter load in Machine 3: ");
        c = scanner.nextInt();

        int sumOfLoad = a+b+c;
        int capacity = sumOfLoad/3;
        double modofLoad = (a+b+c)%3;

        if(modofLoad != 0){
            System.out.println("Balancing is not possible.!");
        }else {
            int ans = 0;
            if(a < capacity){
                ans += capacity - a;
            }
            if (b < capacity){
                ans += capacity - b;
            }
            if (c < capacity){
                ans += capacity - c;
            }
            System.out.println("Total iteration to perform the load balance: "+ans);
        }
    }
}
