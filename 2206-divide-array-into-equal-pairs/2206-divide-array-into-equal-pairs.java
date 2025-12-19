class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i =0, j=1;
         while(j < nums.length){
            if(nums[i] == nums[j]){
                count++;
                i+=2; j+=2;
            }else return false;
              
           }
            return count == nums.length/2;
    }
}