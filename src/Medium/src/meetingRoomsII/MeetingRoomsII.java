package Medium.src.meetingRoomsII;

import java.util.Arrays;

public class MeetingRoomsII {
    public static void main(String[] args){
        int k = 0;
        int[][] mas = {{1, 10}, {2, 3}, {3, 4}, {4, 5}};
        Arrays.sort(mas, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < mas.length - 1; i++){
            if(mas[i][0] < mas[i+1][0]) k++;
            else if(mas[i][1] > mas[i+1][1] & mas[i][1] != mas[i+1][0]) k++;
        }

        System.out.println(k);
    }
}
