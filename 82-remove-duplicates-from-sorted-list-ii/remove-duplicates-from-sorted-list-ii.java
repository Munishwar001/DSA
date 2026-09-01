/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode curr = head;

        while (curr != null) {

            if (curr.next != null && curr.val == curr.next.val) {

                int duplicate = curr.val;

                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

            } else {
                stack.push(curr.val);
                curr = curr.next;
            }
        }

        ListNode dummy = new ListNode(0);
        curr = dummy;

        Stack<Integer> reverse = new Stack<>();

        while (!stack.isEmpty()) {
            reverse.push(stack.pop());
        }

        while (!reverse.isEmpty()) {
            curr.next = new ListNode(reverse.pop());
            curr = curr.next;
        }

        return dummy.next;
    }
}