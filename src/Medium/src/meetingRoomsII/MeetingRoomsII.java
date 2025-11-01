package Medium.src.meetingRoomsII;

import java.util.Arrays;

public class MeetingRoomsII {
    public static void main(String[] args){
        int[][] mas = {{1, 10}, {2, 3}, {3, 4}, {4, 5}};

        int[] starts = new int[mas.length];
        int[] ends = new int[mas.length];

//        Arrays.sort(mas, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < mas.length; i++){
            starts[i] = mas[i][0];
            ends[i] = mas[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int endPointer = 0;

        for(int i = 0; i < mas.length; i++){
            if(starts[i] < ends[endPointer]) rooms++;
            else endPointer++;
        }

        System.out.println(rooms);
    }
}
