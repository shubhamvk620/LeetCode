class Solution {
    public static void combinationSum(int[] candidates, int sum, int target,  List<List<Integer>> ans, List<Integer> curr, int i){
        //base case
          if(i == candidates.length || sum > target){return;}
          //terget match then add 
            if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }
       //recursion call k pahle ka condition
        curr.add(candidates[i]);
        // recursion call
        combinationSum(candidates, sum+candidates[i], target, ans, curr, i);
        //backtracking k pahle ka condition
        curr.remove(curr.size()-1);
        //backtracking call
         combinationSum(candidates, sum,target, ans, curr, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int sum = 0;
        combinationSum(candidates, sum, target, ans, curr, 0);
        return ans;
    }
}