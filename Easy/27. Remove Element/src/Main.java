public class Main {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == val){
                nums[k] = nums[i+1];
                k++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int val = 3;
        int j = 0;

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 3;
        arr[7] = 0;

        System.out.println(removeElement(arr, val));
    }
}