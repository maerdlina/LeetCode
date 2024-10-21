public class Main {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode end = null;
        int val = head.val + 1;
        ListNode newList = new ListNode();
        if(head != null){
            while(head!=null){
                if(head.val != val){
                    newList = new ListNode(head.val);
                    newList.next = end;
                    end = newList;
                }
                val = head.val;
                head = head.next;
            }
            head = end;
            end = null;
            while(head != null){
                newList = new ListNode(head.val);
                newList.next = end;
                end = newList;
                head = head.next;
            }
        }

        return end;
    }

    public static void main(String[] args) {

    }
}