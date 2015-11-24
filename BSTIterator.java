/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        while (root != null) {
            //search all the node from left
            stack.push(root);
            root = root.left;
        }
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    /** @return the next smallest number */
    public int next() {
        //get small node then check right node.
        int smallvalue;
        TreeNode node = stack.pop();
        smallvalue = node.val;
        if(node.right != null){
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return smallvalue;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */