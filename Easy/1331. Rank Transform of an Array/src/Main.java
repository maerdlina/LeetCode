import java.util.Arrays;

public class Main {
    public static int[] arrayRankTransform(int[] arr) {
        if(arr.length!=0){
            int min = arr[0];
            int[] copyArr = arr;
            Arrays.sort(copyArr);
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < min) min = arr[i];
            }
            for(int i = 0; i < arr.length; i++){
                arr[i] = arr[i] / min;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        arr = arrayRankTransform(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}