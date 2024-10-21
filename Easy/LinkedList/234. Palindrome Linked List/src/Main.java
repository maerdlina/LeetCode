import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode newList = head;

        while(newList!=null){
            stack.push(newList.val);
            newList = newList.next;
        }

        newList = head;
        while(newList!=null && newList.val == stack.pop()){
            newList = newList.next;
        }

        return newList == null;
    }
    public static void main(String[] args) {
    }
}