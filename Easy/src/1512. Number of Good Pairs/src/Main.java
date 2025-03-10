import java.util.Scanner;

public class Main {
    public static int numIdenticalPairs(int[] nums) {
        int length = nums.length, pair = 0, index = 0;
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                if(nums[i] == nums[j] && i != j) pair++;
            }
            index++;
        }
        return pair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for(int i = 0; i < count; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
    }
}