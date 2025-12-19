class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i =0, j=1;
         while(i < j){
            if(nums[i] == nums[j]){
                count++;
                i+=2; j+=2;
                if( count == nums.length/2)
                return true;
            }
            else return false;
           }
           return false;
    }
}