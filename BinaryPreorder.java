/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryPreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ReturnList = new ArrayList<Integer>();
        if (root == null) {
            return ReturnList;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            ReturnList.add(n.val);
            
            if(n.right != null){
                stack.push(n.right);
            }
            
            if(n.left != null){
                stack.push(n.left);
            }
            
        }
        
        return ReturnList;
        
    }
    
}