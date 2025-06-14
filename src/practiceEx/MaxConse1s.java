package practiceEx;

//find maximum consecutives

public class MaxConse1s {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        int count = 0;
        int maxCount = 1;
        int mostConseNo = array[0];
        for (int i = 1;i<array.length;i++){
            if(array[i] == array [i-1]){
                count++;
            }else {
                count = 1;
            }
            if(count > maxCount){
                maxCount = count;
                mostConseNo = array[i];
            }
        }
        System.out.println(maxCount);
    }
}
