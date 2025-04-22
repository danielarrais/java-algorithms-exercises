package src.main.twonumbers;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
class TwoNumbersWIthOneLoop {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Next = l1;
        ListNode l2Next = l2;

        int carry = 0;

        // para armazenar o ultimo resultado
        ListNode lastSum = null;

        // cabeça da lista do resultado
        ListNode sumHeard = null;

        do {
            int l1Val = l1Next != null ? l1Next.val : 0;
            int l2Val = l2Next != null ? l2Next.val : 0;

            var total = carry + l1Val + l2Val;
            var result = total > 9 ? total % 10 : total;

            carry = total > 9 ? total / 10 : 0;

            if (sumHeard == null) {
                sumHeard = new ListNode(result);
                lastSum = sumHeard;
            } else {
                lastSum = addNode(result, lastSum);
            }

            l1Next = l1Next != null ? l1Next.next : null;
            l2Next = l2Next != null ? l2Next.next : null;

            if (carry > 0 && (l1Next == null && l2Next == null)) {
                lastSum = addNode(carry, lastSum);
            }

        } while (l1Next != null || l2Next != null);

        return sumHeard;
    }

    public ListNode addNode(int value, ListNode lastNode) {
        lastNode.next = new ListNode(value);
        return lastNode.next;
    }
}
