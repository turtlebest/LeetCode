/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode end = headA;
        
        while(end.next != null) {
            end = end.next;
        }
        
        end.next = headB;
        
        ListNode fast = headA, slow = headA;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = headA;
                while(slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                end.next = null;
                return slow;
            }
        }
        
        end.next = null;
        
        return null;
        
    }
    
}