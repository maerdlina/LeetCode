import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countElements = new HashMap<>();
        Integer maxValue = null;
        int answer = nums[0];

        for (int i = 0; i < nums.length; i++){
            if(!countElements.containsKey(nums[i])) countElements.put(nums[i], 1);
            else {
                countElements.put(nums[i], countElements.get(nums[i]) + 1);
                System.out.println("Key: " + nums[i] + " Count: " + countElements.get(nums[i]));
                if(maxValue == null || countElements.get(nums[i]) > maxValue){
                    maxValue = countElements.get(nums[i]);
                    answer = nums[i];
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int countMatrix = cin.nextInt();
        int[] nums = new int[countMatrix];
        Random random = new Random();
        for(int i = 0; i < countMatrix; i++){
            nums[i] = random.nextInt(5);
        }
        System.out.println(majorityElement(nums));
    }
}