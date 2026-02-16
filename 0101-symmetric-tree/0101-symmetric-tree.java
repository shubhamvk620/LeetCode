/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static boolean isSame(TreeNode L, TreeNode R){
        if(L == null && R == null) { return true;}
        if(L == null || R == null) { return false;}
        if(L.val != R.val) { return false;}

        boolean left = isSame(L.left,R.right);
        boolean right = isSame(L.right,R.left);

        return left&&right;

    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        TreeNode L = root.left;
        TreeNode R = root.right;
        isSame(L, R);
    return isSame(L,R);
      
    }
}