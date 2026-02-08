class Solution {
    public static void combinationSum(int[] candidates, int sum, int target,  Set<List<Integer>> ans, List<Integer> curr, int i){
          if(i == candidates.length || sum > target){return;}
            else if(sum == target){
            ans.add(new ArrayList<>(curr));
        }
       
       
        curr.add(candidates[i]);
        combinationSum(candidates, sum+candidates[i], target, ans, curr, i);
        curr.remove(curr.size()-1);
       // sum = sum - candidates[i];
         combinationSum(candidates, sum,target, ans, curr, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        int sum = 0;
        combinationSum(candidates, sum, target, ans, curr, 0);
        return new ArrayList<>(ans);
    }
}