/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p , q);
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p , q);
        }
            return root;
    }
}

// if p and q both are lesser than root then go left.
// if p & q both are greater than root then go right.
// if either p or q is greate or lesser than root then the current root is the LCA.