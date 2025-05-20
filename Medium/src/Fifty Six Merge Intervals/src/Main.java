import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        if(intervals.length == 0)
            return new int[0][];

        int start = intervals[0][0];
        int end = intervals[0][1];

        ArrayList<int[]> arrays = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (end >= intervals[i][0]){
                end = Math.max(end, intervals[i][1]);
            }
            else {
                arrays.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        arrays.add(new int[]{start, end});

        int[][] result = new int[arrays.size()][2];
        for(int i = 0; i < arrays.size(); i++)
            result[i] = arrays.get(i);

        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[4][2];
        intervals[0] = new int[]{1, 3};
        intervals[1] = new int[]{2, 6};
        intervals[2] = new int[]{8, 10};
        intervals[3] = new int[]{15, 18};

        int[][] mergedIntervals = merge(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}