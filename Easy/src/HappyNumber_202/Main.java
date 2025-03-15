package HappyNumber_202;

import java.util.HashSet;

public class Main {
    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        boolean tf;
        while(n != 1){
            if(hashSet.contains(n)) return false;
            hashSet.add(n);
            int k = 0;
            while(n != 0){
                k += (n % 10) * (n % 10);
                n/=10;
            }
            n = k;
        }
        if(n == 1) tf = true;
        else tf = false;
        return tf;
    }
    public static void main(String[] args){
        System.out.println(isHappy(2));
    }
}

