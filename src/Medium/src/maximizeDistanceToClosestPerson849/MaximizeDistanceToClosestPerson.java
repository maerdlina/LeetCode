package Medium.src.maximizeDistanceToClosestPerson849;

import java.lang.reflect.Array;

public class MaximizeDistanceToClosestPerson {
    public static void main(String[] args){
        Integer[] seats = new Integer[4];

        seats[0] = 1;
        seats[1] = 0;
        seats[2] = 0;
        seats[3] = 0;
//        seats[4] = 1;
//        seats[5] = 0;
//        seats[6] = 1;

        int k = 1;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 0){
                int j = i;
                System.out.println("j: " + j);
                while(seats[j] != 1 || i == seats.length - 1){
                    if(seats[j] == 0 || j != i) k++;
                    j++;
                }
                System.out.println("seat: " + i + "k: " + k);
                k = 0;
                int jj = i;
                while(seats[jj] != 1 || jj != 0){
                    if(seats[jj] == 0 || jj != i) k++;
                    jj--;
                }
                System.out.println("-------------------------------");
                System.out.println("seat: " + i + "k: " + k);
                k = 0;
            }
        }
    }
}
