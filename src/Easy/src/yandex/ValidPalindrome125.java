//package Easy.src.yandex;
package yandex;

public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {
        String newS = s
                .replaceAll(" ", "")
                .replaceAll("[^a-zA-Z0-9\\s]", "")
                .toLowerCase();
        char[] stroke = newS.toCharArray();
        for(int i = 0, j = newS.length() - 1; i < j; i++, j--) {
            if(stroke[i] != stroke[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
