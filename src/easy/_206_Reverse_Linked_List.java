package easy;

public class _206_Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode current = head.next;
            head.next = prev;
            prev = head;
            head = current;
        }

        return prev;
    }

    public static void main(String[] args) {

    }
}
