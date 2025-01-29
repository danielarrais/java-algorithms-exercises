/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Next = l1;
        ListNode l2Next = l2;

        String n1 = "";
        String n2 = "";

        do {
            int l1Val = l1Next != null ? l1Next.val : 0;
            int l2Val = l2Next != null ? l2Next.val : 0;

            n1 += l1Val + "";
            n2 += l2Val + "";

            l1Next = l1Next.next;
            l2Next = l2Next != null ? l2Next.next : null;

        } while (l1Next != null);

        var total = Integer.valueOf(invertString(n1)) + Integer.valueOf(invertString(n2));

        return convertToListNode(total + "");
    }

    public String invertString(String value) {
        int strLenght = value.length();
        char[] chars = value.toCharArray();
        String newValue = "";

        for (int i = strLenght - 1; i > -1; i--) {
            newValue = newValue + chars[i];
        }

        return newValue;

    }

    public ListNode convertToListNode(String value) {
        int strLenght = value.length();
        char[] chars = value.toCharArray();
        
        ListNode sum = null;

        for (int i = 0; i < strLenght; i++) {
            sum = new ListNode(chars[i] - '0', sum);
        }

        return sum;
    }
}
