public class Main {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 8;
        int[] arr_new = plusOne(arr);
        for (int i = 0; i < arr_new.length; i++){
            System.out.println(arr_new[i]);
        }
    }
}