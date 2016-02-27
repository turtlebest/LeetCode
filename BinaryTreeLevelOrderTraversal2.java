/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> tempS = new Stack<List<Integer>>();
        List<Integer> valueLevel = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {
            return result;
        }
        
        LinkedList<TreeNode> cur = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        cur.add(root);
        
        while (!cur.isEmpty()) {
            TreeNode node = cur.remove();
            
            if (node.left != null) {
                next.add(node.left);
            }
            
            if (node.right != null) {
                next.add(node.right);
            }
            
            valueLevel.add(node.val);
            
            if (cur.isEmpty()) {
                cur = next;
                next = new LinkedList<TreeNode>();
                tempS.push(valueLevel);
                valueLevel = new ArrayList<Integer>();
            }
        }
        
        while (!tempS.isEmpty()) {
            result.add(tempS.pop());
        }
        
        return result;
    }
    
}