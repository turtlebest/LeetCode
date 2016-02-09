/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode cur = newList;
        
        while (l1 != null && l2 != null){
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else  {
                cur.next = l2;
                l2 = l2.next;
            }
            
            /*           if (l1 == null){
             cur.next = l2;
             l2 = l2.next;
             }
             
             if (l2 == null){
             cur.next = l1;
             l1 = l1.next;
             }*/
            cur = cur.next;
        }
        
        cur.next = (l1 != null) ? l1:l2;
        
        return newList.next;
    }
    
}