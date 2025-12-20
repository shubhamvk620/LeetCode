class Solution {
    public int smallestEqual(int[] nums) {
      for(int i = 0; i < nums.length;i++){
        if(i%10==nums[i]){
            return i;
            }
            else{
            continue;}
      }  
      return -1;
    }
}