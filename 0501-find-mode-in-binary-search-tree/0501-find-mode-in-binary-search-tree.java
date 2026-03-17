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
    public static void same(TreeNode root, Map<Integer,Integer> map){
        if(root == null){
            return;
        }
       

        same(root.left,map);
         map.put(root.val, map.getOrDefault(root.val,0)+1);
        same(root.right,map);
    }
    public int[] findMode(TreeNode root) {
       // if(root == null) return new int[root];
        Map<Integer,Integer> map = new HashMap<>();
        same(root,map);

        int max = Integer.MIN_VALUE;
        List<Integer>list = new ArrayList<>();
        for(Integer key : map.keySet()){
           max = Math.max(max,map.get(key));
        }
       
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() == max)
        list.add(entry.getKey());
       }

       int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
       return arr;
    }
}