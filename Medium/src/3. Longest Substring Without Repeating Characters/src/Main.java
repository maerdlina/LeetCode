import java.util.ArrayList;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int maxLength = 0;
        String currentSub = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = currentSub.indexOf(c);

            if (index != -1) {
                // Обновляем максимальную длину
                if (currentSub.length() > maxLength) maxLength = currentSub.length();

                // Обрезаем подстроку до символа после повторяющегося
                currentSub = currentSub.substring(index + 1);
            }

            currentSub += c;
        }

        // Проверяем последнюю подстроку
        return Math.max(maxLength, currentSub.length());
    }

    public static void main(String[] args) {
        String s = "pwwaba";
        System.out.println(lengthOfLongestSubstring(s)); // Теперь выведет 1
    }
}
