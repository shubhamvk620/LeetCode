class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length-1;
        int sum = 0;
        for(int i = n; i >= 0; i--){
            for(int j = i; j >= 0; j--){
               sum += nums[j]; 
            }
            nums[i] = sum;
            sum = 0;
        }
        return nums;
    }
}