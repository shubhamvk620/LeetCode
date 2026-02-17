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
        boolean isSame = false;
    public void hasPathSum(TreeNode root, int targetSum, int ans){
        if(root == null){
            return;
        }
        ans += root.val;
        if(ans == targetSum && root.left == null && root.right == null){
            isSame = true;
            return;
        }

    hasPathSum(root.left, targetSum, ans);
    hasPathSum(root.right, targetSum, ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){return false;}
        //
        // int sum += root.val;
        // int ans = sum;
        hasPathSum(root, targetSum, 0);
        return isSame;
    }
}