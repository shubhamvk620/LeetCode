class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pair = 0;
        int i = 0;
        while (i+1 < nums.length){
            if(nums[i]==nums[i+1]){
                pair++;
                i+=2;
            }else 
                i++;
            
        }
        int left = nums.length-(2*pair);
        return new int[]{pair,left};
    }
}