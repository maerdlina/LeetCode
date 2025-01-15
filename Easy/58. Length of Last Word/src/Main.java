public class Main {
    public static int lengthOfLastWord(String s) {
        int ansv = 1;
        for(char i: s.toCharArray()){
            if(i != ' '){
                ansv++;
            } else if(ansv != 0){
                break;
            }
        }

        return ansv;
    }
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}