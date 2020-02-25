package Exercises_Examples;

/*
 * Single Linked List without dummy node
 */
public class SingleLinkedList {

    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    public SingleLinkedList(int[] data) {
        // in class exercise
        ListNode ptr = null;
        for (int i =0; i < data.length; i++){
            ListNode newNode = new ListNode(data[i]);
            if (head == null){
                head = newNode;
                ptr = head;
                continue;
            }
            ptr.next = newNode;
            ptr = ptr.next;
        }
    }

    public ListNode getLast() {
        // in class exercise
        ListNode ptr = head;
        if (head == null){
            return null;
        }
        while (ptr.next != null){
            ptr = ptr.next;
        }
        return ptr;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head;
        while (ptr != null) {
            builder.append(ptr.val + (ptr.next == null ? " -> end" : " -> "));
            ptr = ptr.next;
        }

        return builder.toString();
    }
}