class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans1 = new int[]{-1, -1};
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == target){
            if((i ==0 && nums[i] == target) || nums[i] != nums[i-1]){
                ans[0] = i;
            }if((i == nums.length-1 && nums[i] == target) || nums[i] != nums[i+1]){
                ans[1] = i;
                return ans;
            }
           }
        }
       
        return ans1;
    }
}