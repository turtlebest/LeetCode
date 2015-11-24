/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class MergeSort {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        
        ListNode counter = head;
        int len = 0;
        while (counter != null) {
            counter = counter.next;
            len++;
        }
        
        ListNode[] headArray = {head};
        return mergeSort(headArray, len);
    }
    
    public ListNode mergeSort(ListNode[] headArray, int len) {
        if (len == 1) {
            ListNode temp = headArray[0];
            headArray[0] = headArray[0].next;
            
            temp.next = null;
            return temp;
        }
        
        ListNode right = mergeSort(headArray, len/2);
        ListNode left = mergeSort(headArray, len - len/2);
        
        return merge(right, left);
    }
    
    public ListNode merge(ListNode right, ListNode left) {
        if (left == null) {
            return left;
        }
        
        if (right == null) {
            return right;
        }
        
        ListNode preHead = new ListNode(-1);
        ListNode end = preHead;
        
        while (left!=null && right != null) {
            if (left.val < right.val){
                end.next = left;
                left = left.next;
            } else {
                end.next = right;
                right = right.next;
            }
            
            end = end.next;
        }
        
        if (left != null) {
            end.next = left;
        }
        
        if (right != null) {
            end.next = right;
        }
        
        return preHead.next;
    }
}