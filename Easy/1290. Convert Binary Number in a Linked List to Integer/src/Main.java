import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int getDecimalValue(ListNode head) {
        Stack<Integer> num_binary = new Stack<>();
        int num_dec = 0;
        int pow = 0;
        while(head != null){
            num_binary.push(head.val);
            head = head.next;
        }
        while(!num_binary.isEmpty()){
            num_dec+=num_binary.pop() * Math.pow(2, pow++);
        }
        return num_dec;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListNode listNode = new ListNode();
        ListNode head = new ListNode(scanner.nextInt());
        listNode = head;
        for(int i = 2; i < 4; i++){
            listNode.next = new ListNode(scanner.nextInt());
            listNode = listNode.next;
        }

        listNode = head;

        System.out.println(getDecimalValue(listNode));



        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}