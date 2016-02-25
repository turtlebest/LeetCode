/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode cur = head.next, first = head, last = head;
        
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = first;
            last.next = temp;
            first = cur;
            cur = temp;
        }
        
        return first;
        
    }
}

//O(n)