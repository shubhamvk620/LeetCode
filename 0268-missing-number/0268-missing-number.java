class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]==i||nums[i]>=nums.length){
                i++;
            }else{
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp]=temp;}

        }
        for(int j  = 0; j<nums.length;j++){
            if(j!=nums[j]) return j;
        }
        return nums.length;
    }
}