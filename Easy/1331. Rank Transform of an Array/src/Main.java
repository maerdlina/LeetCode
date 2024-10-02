import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] arrayRankTransform(int[] arr) {
        if(arr.length!=0){
            int[] sortedArr = arr.clone();
            Arrays.sort(sortedArr);

            Map<Integer, Integer> rankMap = new HashMap<>();
            int rank = 1;

            for(int num: sortedArr){
                if(!rankMap.containsKey(num)) rankMap.put(num, rank++);
            }

            for(int i = 0; i < arr.length; i++){
                arr[i] = rankMap.get(arr[i]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40, 10, 20, 30})));
    }
}