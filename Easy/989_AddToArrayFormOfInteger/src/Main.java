import java.util.*;
import java.util.Collections;

public class Main {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList();

        int i = num.length;;
        while (--i >= 0 || k > 0) {
            if (i >= 0)
                k += num[i];
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 9;
        int k = 120;
        System.out.println(addToArrayForm(arr, k));
    }
}