//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String[] nums = {"hello", "i", "am", "leetcode", "hello"};
        int n = nums.length;
        int startIndex = 1;
        String target = "hello";

        System.out.println(closetTarget(nums,
                                        target,
                                        startIndex));
    }

    public static int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                found = true;
                int direct = Math.abs(i - startIndex);
                int circular = n - direct;
                int distance = Math.min(direct, circular);
                minDistance = Math.min(minDistance, distance);
            }
        }

        return found ? minDistance : -1;
    }
}