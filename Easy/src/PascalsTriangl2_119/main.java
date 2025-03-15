//https://leetcode.com/problems/pascals-triangle-ii/description/

package PascalsTriangl2_119;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> end = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<>();

        row.add(1);
        end.add(row);

        for(int i = 1; i <= rowIndex; i++){
            row = new ArrayList<>();
            int prew = 0;
            for(int j = 0; j < i; j++){
                int next = end.get(i-1).get(j);
                row.add(next + prew);
                prew = next;
            }
            row.add(1);
            end.add(row);
        }

        return end.get(rowIndex);
    }
    public static void main(String[] args){
        System.out.println(getRow(6));
    }
}
