public class Main {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 0;
        System.out.println(getMinDistance(nums, target, start));
    }

    public static int getMinDistance(int[] nums,
                                     int target,
                                     int start) {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if(min > Math.abs(i - start)) {
                    min = Math.abs(i - start);
                    index = i;
                }
            }
        }

        return Math.abs(index - start);
    }
}