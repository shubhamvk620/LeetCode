class Solution {
    public static void combinationSum2(int[] candidates, int sum, int target,  List<List<Integer>> ans, List<Integer> curr, int i){
        //base case
          //traget match then add 
            if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }
      //  if(sum > target) return;
       //loop for calls
       for(int j = i; j < candidates.length; j++){

        //same element then continue and j always start from i+1 so same ith element can't be picked
        if(j > i && candidates[j] == candidates[j-1]) continue;

        //greater mila toh runnning call k lea loop end krdo and back track to previous call and start loop from  j+1
        if(sum + candidates[j] > target) break;

        //adding in curr
        curr.add(candidates[j]);
        //recursion call
        combinationSum2(candidates, sum+candidates[j], target, ans, curr, j+1);
        //bacltrack
        curr.remove(curr.size()-1);
       }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinationSum2(candidates, 0, target, ans, curr, 0);
        return new ArrayList<>(ans);
    }
}