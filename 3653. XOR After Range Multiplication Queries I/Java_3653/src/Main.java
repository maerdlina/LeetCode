import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {2,3,1,5,4};
        int[][] b = {{1,4,2,3}, {0,2,1,2}};
        System.out.println(xorAfterQueries(a, b));
    }

    public static int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1_000_000_007;

        // Обрабатываем все запросы
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            int ki = queries[i][2];
            int vi = queries[i][3];

            // Применяем умножение к нужным индексам
            for (int idx = li; idx <= ri; idx += ki) {
                nums[idx] = (int)((long)nums[idx] * vi % MOD);
            }
        }

        // Вычисляем XOR всех элементов
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}