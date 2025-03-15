//https://leetcode.com/problems/pascals-triangle/description/

package Pascal_Triangle_118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> end = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<>();

        row.add(1);
        end.add(row);

        for(int i = 1; i < numRows; i++){
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

        return end;
    }
    public static void main(String[] args){
        System.out.println(generate(6));
    }
}
