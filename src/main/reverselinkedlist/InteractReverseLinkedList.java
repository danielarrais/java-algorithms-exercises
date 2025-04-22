package src.main.reverselinkedlist;

// https://leetcode.com/problems/reverse-linked-list/
public class InteractReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        listNode = new ListNode(4, listNode);
        listNode = new ListNode(3, listNode);
        listNode = new ListNode(2, listNode);
        listNode = new ListNode(1, listNode);

        ListNode reversed = reverse(listNode);
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode next = head;
        ListNode previous = null;
        ListNode newHead = null;

        while (next != null) {
            newHead = next;
            next = next.next;
            newHead.next = previous;
            previous = newHead;
        }

        return newHead;
    }
}