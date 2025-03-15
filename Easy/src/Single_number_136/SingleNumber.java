package Single_number_136;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int number = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
                System.out.println(map.get(nums[i]));
            }
        }
        for(int i = 0; i < nums.length; i++) if(map.get(nums[i]) == 1) number = nums[i];

        return number;
    }

    public static void main(String[] args){
        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            Random rd = new Random();
            nums[i] = rd.nextInt(0, 10);
            System.out.println( nums[i] + " " );
        }
        System.out.println( "---------------------" );
        System.out.println(singleNumber(nums));
    }
}
