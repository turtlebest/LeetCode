/*
 You have two every large binary trees: T1,
 with millions of nodes, and T2, with hundreds of nodes.
 Create an algorithm to decide if T2 is a subtree of T1.
 
 Example
 T2 is a subtree of T1 in the following case:
        1                3
       / \              /
 T1 = 2   3      T2 =  4
         /
        4
 T2 isn't a subtree of T1 in the following case:
        1               3
       / \               \
 T1 = 2   3       T2 =    4
     /
    4
 
 Note
 A tree T2 is a subtree of T1 if there exists a node n in T1 such that
 the subtree of n is identical to T2.
 That is, if you cut off the tree at node n,
 the two trees would be identical.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isSubTree(TreeNode T1, TreeNode T2) {
        if (T1 == null) {
            return false;
        }
        if (T2 == null) {
            return true;
        }

        
        return (isSubTree(T1.right, T2) || isSubTree(T1.left, T2) || isSameTree(T1,T2));
        
    }
    
    public boolean isSameTree(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) {
            return true;
        }
        if (T1 == null || T2 == null) {
            return false;
        }
        
        if (T1.val != T2.val) {
            return false;
        }
        
        return (isSameTree(T1.left,T2.left)&&isSameTree(T1.right, T2.right));
        
    }
    
}