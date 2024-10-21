public class Main {
    public static boolean isPowerOfTwo(int n) {
        for(int i = 0; i < 31; i++){
            int end = (int)Math.pow(2, i);
            if(end == n) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}