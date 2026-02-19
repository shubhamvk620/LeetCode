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
    public List<List<Integer>> levelOrder(TreeNode root) { 
        List<List<Integer>> ans = new ArrayList<>();
         if(root == null) return ans;
         //implemented queue
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); // root initialized in queue 
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>curr = new ArrayList<>();
            //loop till q become empty
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                curr.add(temp.val);
            if(temp.left!=null){q.offer(temp.left);}
            if(temp.right!=null){q.offer(temp.right);}
            }   
            ans.add(curr);
        }
        
        return ans;
    }
}