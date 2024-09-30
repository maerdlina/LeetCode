import java.util.Arrays;

public class Main {
    public static int leastInterval(char[] tasks, int n){
        int[] char_map = new int[26];
        for(char c: tasks){
            char_map[c-'A']++;
        }
        Arrays.sort(char_map);
        int max_value = char_map[25] - 1;
        int idle_slots = max_value * n;
        for(int i = 24; i >= 0; i--){
            idle_slots -= Math.min(char_map[i], max_value);
        }

        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
    }

    public static void main(String[] args) {
        int n = 2;
        char[] tasks = new char[6];
        tasks[0] = 'A';
        tasks[1] = 'A';
        tasks[2] = 'A';
        tasks[3] = 'B';
        tasks[4] = 'B';
        tasks[5] = 'B';
        System.out.println(leastInterval(tasks, n));
    }
}