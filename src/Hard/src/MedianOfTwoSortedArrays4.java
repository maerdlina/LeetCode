import java.util.Arrays;

public class MedianOfTwoSortedArrays4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
        if(merged.length % 2 == 0) return (double) (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2;
        else
            return merged[merged.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
