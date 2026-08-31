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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head.next;
        ListNode prev = head;
        int index = 1;
        while (curr != null && curr.next != null) {
            if ((curr.val < prev.val && curr.val < curr.next.val)
                    || (curr.val > prev.val && curr.val > curr.next.val)) {
                list.add(index);
            }
            index++;
            prev = curr;
            curr = curr.next;
        }
        Collections.sort(list);
        if (list.size() < 2) {
            return new int[] { -1, -1 };
        }
        int max = list.get(list.size() - 1) - list.get(0);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int distance = list.get(i) - list.get(i - 1);
            if (distance < min) {
                min = distance;
            }
        }
        return new int[] { min, max };
    }
}