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
        //checking leaf is null or not
        if(root == null){
            return;
        }
        // add curr root node in ans before call
        ans += root.val;
        
        if(ans == targetSum && root.left == null && root.right == null){
            isSame = true;
            return;
        }

    hasPathSum(root.left, targetSum, ans);
    hasPathSum(root.right, targetSum, ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // check tree is null or not
        if(root == null){return false;}
       
        hasPathSum(root, targetSum, 0);
        return isSame;
    }
}