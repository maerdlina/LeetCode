public class Main {
    public static ListNode removeElements(ListNode head, int val) {
//       ListNode end = null;
//       while(head != null){
//           if(head.val != val) {
//               end = new ListNode(head.val, end);
//           }
//           head = head.next;
//       }
//       head = end;
//       end = null;
//       while(head != null){
//           end = new ListNode(head.val, end);
//           head = head.next;
//       }
//       return end;

        ListNode end = new ListNode(-1);
        end.next = head;

        ListNode copy = end;
        while(copy.next != null){
            if(copy.next.val == val)
                copy.next = copy.next.next;
            else
                copy = copy.next;
        }

        return end.next;
    }

    public static void main(String[] args) {
        ListNode head = null;
        for(int i = 0; i < 5; i++){
            head = new ListNode(i, head);
        }
        ListNode listNode = removeElements(head, 3);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}