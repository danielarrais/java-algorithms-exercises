/**
 * https://leetcode.com/problems/add-two-numbers
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Next = l1;
        ListNode l2Next = l2;

        int carry = 0;

        // Para armazenar o ultimo resultado inserido na lista
        ListNode lastSum = null;

        // Cabeça da lista do resultado
        ListNode sumHeard = null;  

        do {
            int l1Val = l1Next.val;
            int l2Val = l2Next != null ? l2Next.val : 0;

            var total = carry + l1Val + l2Val;
            var result = total > 9 ? total % 10 : total;

            carry = total > 9 ? total / 10 : 0;

            if (sumHeard == null) {
                sumHeard = new ListNode(result);
                lastSum = sumHeard;
            } else {
                lastSum = addInversedNode(result, lastSum);
            }

            l1Next = l1Next.next;
            l2Next = l2Next != null ? l2Next.next : null;

            if(carry > 0 && l1Next == null) {
                lastSum = addInversedNode(carry, lastSum);
            }

        } while (l1Next != null);

        return sumHeard;
    }

    public ListNode addInversedNode(int value, ListNode lastNode) {
        lastNode.next = new ListNode(value);
        return lastNode.next;
    }
}
