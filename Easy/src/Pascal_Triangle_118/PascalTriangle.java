package Pascal_Triangle_118;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> end = new ArrayList<List<Integer>>(numRows);
        end.add(List.of(1));

        return end;
    }
    public static void main(String[] args){

    }
}
