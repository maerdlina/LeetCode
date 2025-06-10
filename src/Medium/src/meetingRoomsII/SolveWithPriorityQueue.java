package Medium.src.meetingRoomsII;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SolveWithPriorityQueue {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Сортируем по началу встречи
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Куча для хранения концов встреч (минимум сверху)
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // Если текущая встреча начинается после окончания самой ранней
            if (intervals[i][0] >= heap.peek()) {
                heap.poll(); // Освобождаем комнату
            }
            heap.offer(intervals[i][1]); // Добавляем текущую встречу
        }

        return heap.size();
    }
}

/*
Почему это работает:
Куча хранит окончания встреч в порядке возрастания.

Если начало новой встречи >= heap.peek() → используем ту же комнату (удаляем окончание из кучи).

Размер кучи в конце — количество необходимых комнат.
*/
