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
     int ans = Integer.MAX_VALUE;
    public void minDepth(TreeNode root,int count){
          if(root == null){
            return;
        }       
         // Check if leaf node
        if(root.left == null && root.right == null){
            ans = Math.min(ans, count);
            return;
        }
        minDepth(root.left, count+1);
        minDepth(root.right, count+1);
    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        } 
        minDepth(root,1);
        return ans;
    }
}