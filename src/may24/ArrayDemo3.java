package may24;
import java.util.Arrays;
public class ArrayDemo3 {
    public static void main(String[] args) {

        int[] array = {12, 23, 543, 23, 45, 10001, 23, 1243, 43, 23};

        int maxVal = array[0];
        int minVal = array[0];

        for(int i=0;i<array.length;i++){
            if(maxVal<array[i]){
                maxVal = array[i];
            }
        }
        System.out.println("Max val is:"+maxVal);

        for(int i = 0; i < array.length;i++){
            if(minVal >= array[i]){
                minVal = array[i];
            }
        }
        System.out.println("Min val is: "+minVal);
    }
}
