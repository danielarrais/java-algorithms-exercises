package reverselinkedlist;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

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

        ListNode reversed = reverse(listNode, null);
    }

    public static ListNode reverse(ListNode next, ListNode previous) {
        if (next == null) return null;

        ListNode nextNode = next.next;
        next.next = previous;

        if (nextNode == null) {
            return next;
        };

        return reverse(nextNode, next);
    }
}