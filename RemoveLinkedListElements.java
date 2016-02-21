/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        
        ListNode removeList = new ListNode(0);
        ListNode pre = removeList;
        removeList.next = head;
        
        while(pre.next != null) {
            if (pre.next.val == val) {
                ListNode next = pre.next;
                pre.next = next.next;
            } else {
                pre = pre.next;
            }
        }
        
        return removeList.next;
    }
    
}