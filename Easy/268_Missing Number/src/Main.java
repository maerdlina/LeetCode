public class Main {
    public static int missingNumber(int[] nums) {
        int sum = (nums.length + 1) * nums.length / 2;
        int i = 0;
        while (i < nums.length) {
            sum -= nums[i++];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        System.out.println(missingNumber(arr));
    }
}