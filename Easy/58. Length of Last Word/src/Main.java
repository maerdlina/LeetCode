public class Main {
    public int lengthOfLastWord(String s) {
        int ansv = 0;
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

    }
}