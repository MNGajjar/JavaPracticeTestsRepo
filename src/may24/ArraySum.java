package may24;

import java.util.Scanner;

public class ArraySum {

    public static int[][] sum(int[][] array1, int[][] array2){
        int rows = array1.length;
        int cols = array1[0].length;
        int [][] answer = new int[rows][cols];
        for(int i = 0; i< rows;i++){
            for (int j = 0;j<cols;j++){
                answer[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrSize = 3;
        int[][] array1 = new int[arrSize][arrSize];
        int[][] array2 = new int[arrSize][arrSize];

        System.out.println("Enter an elements of 3 x 3 array of array1: ");
        for(int i=0;i<arrSize;i++){
            for (int j = 0;j<arrSize;j++){
                System.out.printf("[%d][%d]: ",i,j);
                array1[i][j] = scanner.nextInt();;
            }
        }

        System.out.println("Enter an elements of 3 x 3 array of array2: ");
        for(int i=0;i<arrSize;i++){
            for (int j = 0;j<arrSize;j++){
                System.out.printf("[%d][%d]: ",i,j);
                array2[i][j] = scanner.nextInt();;
            }
        }

        int[][] addition = sum(array1,array2);

        System.out.println("Addition of given array is: ");
        for(int i=0;i<arrSize;i++){
            for (int j = 0;j<arrSize;j++){
                System.out.printf(addition[i][j] + "");
            }
            System.out.println();
        }
    }
}
