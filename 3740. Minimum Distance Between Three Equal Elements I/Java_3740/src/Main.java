import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //            0  1  2  3  4
        int[] nums = {1, 1, 1, 1};
        System.out.println(minimumDistance(nums));
    }

    public static int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        for(List<Integer> indices : map.values()){
            if(indices.size() < 3) continue;

            for(int i = 0; i <= indices.size() - 3; i++){
                int dist = 2 * (indices.get(i + 2) - indices.get(i));
                min = Math.min(min, dist);
            }
        }

        return min != Integer.MAX_VALUE ? min : -1;
    }
}