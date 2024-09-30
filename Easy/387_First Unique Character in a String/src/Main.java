public class Main {
    public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    break;
                }

                if (j == ch.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("lovveeetcodel"));
    }
}