public class Main {
    public static int lengthOfLastWord(String s) {
        int ansv = 0, length = s.length();

        int endIndex = length - 1;
        while(endIndex >= 0 && s.charAt(endIndex) == ' ')
            endIndex--;

        int startIndex = endIndex;
        while(startIndex >= 0 && s.charAt(startIndex) != ' ') startIndex--;

        return endIndex - startIndex;
    }

    public static void main(String[] args) {
        String s = "   Hello World   ";
        System.out.println(lengthOfLastWord(s));
    }
}