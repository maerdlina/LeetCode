public class Main {
    public boolean isPowerOfThree(int n) {
        int sum = 1;
        while(sum < Integer.MAX_VALUE / 3){
            if(sum == n) return true;
            sum *= 3;
        }
        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {

    }
}