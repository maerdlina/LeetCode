public class Main {
    public ListNode reverseList(ListNode head) {
        ListNode end = null;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = end;
            end = newNode;
            head = head.next;
        }
        return end;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        for(int i = 0; i < 5; i++){
            listNode = new ListNode(i, listNode);
        }
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}