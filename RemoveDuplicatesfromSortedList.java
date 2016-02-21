/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode cur = head;
        ListNode pre = null;
        
        while (cur != null) {
            if (pre != null) {
                if (cur.val == pre.val) {
                    pre.next = cur.next;
                    cur = pre;
                }
            }
            pre = cur;
            cur = cur.next;
        }
        
        return head;
    }
}
//O(n);