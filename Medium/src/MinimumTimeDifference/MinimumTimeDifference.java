package MinimumTimeDifference;

import java.util.*;

public class MinimumTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> times = new ArrayList<>();
        for (String s : timePoints) {
            int hour = Integer.parseInt(s.substring(0, 2));
            int minut = Integer.parseInt(s.substring(3));
            times.add(hour * 60 + minut);
        }
        Collections.sort(times);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < times.size(); i++) {
            int diff = times.get(i) - times.get(i - 1);
            minDiff = Math.min(minDiff, Math.min(diff, 1440 - diff));
        }
        // Проверяем разницу между последним и первым элементом (циркулярный случай)
        int circularDiff = times.get(0) + 1440 - times.get(times.size() - 1);
        minDiff = Math.min(minDiff, circularDiff);

        return minDiff;
    }

    public static void main(String[] args){
        List<String> timePoints = new ArrayList<>(List.of("00:00","23:59","00:00"));
        System.out.println(findMinDifference(timePoints));
    }
}
