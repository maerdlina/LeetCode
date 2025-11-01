package yandex;

import java.util.ArrayList;
import java.util.List;


public class SummaryRanges228 {

    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        ArrayList<String> str = new ArrayList<>();
        if (n == 0) return str;

        for( int i = 0; i < n; i++ ) {
            StringBuilder sb = new StringBuilder();
            int start = nums[i];

            while( (i + 1) < n && ( nums[i + 1] - nums[i] ) == 1  ) {
                i += 1;
            }

            if( start != nums[i] ) {
                sb.append(start);
                sb.append("->");
                sb.append(nums[i]);

            }
            else{
                sb.append(start);
            }
            str.add(sb.toString());
        }


        return str;
    }

    public static void main(String[] args) {
        System.out.println(new SummaryRanges228().summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}

/*
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int n = nums.length - 1;
        Integer first, second;
        for (int i = 0; i <= n; i++) {
            first = nums[i];
            second = null;
            while (i < n && nums[i + 1] - nums[i] == 1) {
                second = nums[i + 1];
                i++;
            }
            if (second != null) {
                res.add(String.valueOf(first) + "->" + String.valueOf(second));
                continue;
            }
            res.add(String.valueOf(first));
        }
        return res;
    }
}
 */