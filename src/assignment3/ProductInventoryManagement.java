package assignment3;

public class ProductInventoryManagement {

    public static void main(String[] args) {
        String[] productName = {"iPhone", "airPods", "charger", "iWatch", "macBook"};
        double[] productPrice = {1500.99,399.99,75.99,899.99,2399.99};



        for(int i = 0; i<productName.length ; i++){
                System.out.println(productName[i]);
            }
        System.out.println("----------------------------");
        for (int j = 0; j<productPrice.length;j++){
            System.out.println(productPrice[j]);
        }



    }
}
