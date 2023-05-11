package easy;

public class _876_Middle_of_the_Linked_List {
    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}


