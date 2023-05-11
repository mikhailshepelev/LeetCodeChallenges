package easy;

public class _203_Remove_Linked_List_Elements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                if (current.next.next == null) current.next = null;
                else {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }
        }

        return current == dummy ? null : current;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode second = new ListNode(7);
        ListNode third = new ListNode(7);
        ListNode forth = new ListNode(7);
        head.next = second;
        second.next = third;
        third.next = forth;

        removeElements(head, 7);

        ListNode head1 = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode third1 = new ListNode(6);
        ListNode forth1 = new ListNode(3);
        ListNode fifth1 = new ListNode(4);
        ListNode sixth1 = new ListNode(5);
        ListNode seventh1 = new ListNode(6);
        head1.next = second1;
        second1.next = third1;
        third1.next = forth1;
        forth1.next = fifth1;
        fifth1.next = sixth1;
        sixth1.next = seventh1;

        removeElements(head1, 6);
    }
}
