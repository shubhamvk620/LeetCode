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
    public static void  preorderTraversal(TreeNode root, List<Integer>ans){
        //base case
        if(root == null)return;

       ans.add(root.val);                 // D -> print data
        preorderTraversal(root.left,ans); // L -> left call
        preorderTraversal(root.right,ans);// R -> right call
       
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
         preorderTraversal(root,ans);
         return ans;
    }
}