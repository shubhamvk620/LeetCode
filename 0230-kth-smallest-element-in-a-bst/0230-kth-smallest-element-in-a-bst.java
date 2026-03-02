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
class Solution{
    int ans = 0;
    int c = 0;
     public void smallest(TreeNode root, int k){
         if(root == null) return;
        
        //first left call until last;
         smallest(root.left, k);

         //backtrack hoga then count++
         c++;
         if(c == k){
         ans = root.val;
         return;
         }

         //right call;
         smallest(root.right, k);
         

     }
     public int kthSmallest(TreeNode root, int k){
        if(root == null) return 0;
         smallest(root, k);
         return ans;
     }
}

// class Solution {
//     public static void smallest(TreeNode root, int k, List<Integer>list){
//         if(root == null) return;

//         smallest(root.left, k, list);
//         list.add(root.val);
//         smallest(root.right, k, list);

//     }
//     public int kthSmallest(TreeNode root, int k) {
//         if(root == null) return 0;
//         List<Integer>list = new ArrayList<>();
//         smallest(root, k, list);

//         int[] arr = new int[list.size()];
//          for(int i = 0; i < list.size(); i++){
//             arr[i] = list.get(i);
//          }
//             return arr[k-1];
//     }
// }