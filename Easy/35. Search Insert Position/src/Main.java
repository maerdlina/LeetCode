import java.util.Scanner;

public static int searchInsert(int[] nums, int target) {
    int index=nums.length;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= target) {
            index = i;
            break;
        }
    }
    return index;
}

public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int count = 4;
    int[] nums = new int[count];
    for (int i = 0; i < count; i++) {
        nums[i] = cin.nextInt();
    }
    System.out.println(searchInsert(nums, 3));
}