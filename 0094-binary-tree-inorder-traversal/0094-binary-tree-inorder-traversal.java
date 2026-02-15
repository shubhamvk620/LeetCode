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
    public static void inorderTraversal(TreeNode root, List<Integer> ans){
        //base case
        if(root == null) return;

        inorderTraversal(root.left, ans); // L -> left call
        ans.add(root.val);                // D -> data print
        inorderTraversal(root.right, ans);// R -> right call
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversal(root,ans);
        return ans;
    }
}