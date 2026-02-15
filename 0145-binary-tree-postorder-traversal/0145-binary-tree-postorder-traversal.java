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
    public static void  postorderTraversal(TreeNode root, List<Integer>ans){
        //base case
        if(root == null)return;

        postorderTraversal(root.left,ans); // L -> left call
        postorderTraversal(root.right,ans);// R -> right call
        ans.add(root.val);                 // D -> print data
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
         postorderTraversal(root,ans);
         return ans;
    }
}