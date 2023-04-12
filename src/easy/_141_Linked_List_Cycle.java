package easy;

public class _141_Linked_List_Cycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return false;

        ListNode firstPointer = head.next;
        ListNode secondPointer = head.next.next;

        while (!firstPointer.equals(secondPointer)) {
            if (firstPointer.next == null) return false;
            if (secondPointer.next == null || secondPointer.next.next == null) return false;

            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
        }

        return true;
    }
}
