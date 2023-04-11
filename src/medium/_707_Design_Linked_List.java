package medium;

public class _707_Design_Linked_List {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    int size;
    Node dummyNode;

    public _707_Design_Linked_List() {
        dummyNode = new Node(-1);
        size = 0;
    }

    public int get(int index) {
        if (index >= size) return -1;
        Node current = dummyNode;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = dummyNode.next;
        dummyNode.next = node;
        size++;
    }

    public void addAtTail(int val) {
        Node toAdd = new Node(val);
        Node current = dummyNode;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        current.next = toAdd;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        Node toAdd = new Node(val);
        Node current = dummyNode;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        toAdd.next = current.next;
        current.next = toAdd;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        Node current = dummyNode;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
}
