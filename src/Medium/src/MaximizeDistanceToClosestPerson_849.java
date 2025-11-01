package Medium.src;

import java.util.ArrayList;


public class MaximizeDistanceToClosestPerson_849 {

    public static int maxDistToClosest(int[] seats) {
        ArrayList<Integer> end = new ArrayList<>();

        for(int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                int leftDistance = Integer.MAX_VALUE, rightDistance = Integer.MAX_VALUE;

                for (int j = i; j < seats.length; j++) {
                    if (seats[j] == 1) {
                        rightDistance = j - i;
                        break;
                    }
                }

                for (int j = i; j >= 0; j--) {
                    if (seats[j] == 1) {
                        leftDistance = i - j;
                        break;
                    }
                }

                end.add(Math.min(leftDistance, rightDistance));
            }
        }

        int max = 0;
        for (int dist : end) {
            if (dist > max) max = dist;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] seats = {0, 1, 0, 0, 0, 0};
        System.out.println(maxDistToClosest(seats));
    }
}
