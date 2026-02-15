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
     int ans = 0;
    public void maxDepth(TreeNode root,int count){
        if(root == null){
            ans = Math.max(ans,count);
            return;
        }         
    
        maxDepth(root.left, count+1);
        maxDepth(root.right, count+1);
    }
    public int maxDepth(TreeNode root) {
        maxDepth(root,0);
        return ans;
    }
}