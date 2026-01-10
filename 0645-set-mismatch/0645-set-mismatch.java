class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while( i < nums.length){
            int corrIndex = nums[i]-1;
            if(nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[corrIndex]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }else{i++;}
    
        }
        // 2 index ka array banaye becz eek hi missing & eek hi dubllicate hoga. Not more than 1.
        int[] ans = new int[2];
        for(i = 0; i < nums.length; i++){
            /* agar num[i] apne correct index pe nhi aaya swap k naad 
            wahi dublicate hai or wo jike index pe baitha hai (i) wahi i+1 elment misssing hai.*/
        
            if(nums[i] != i+1){
               ans[0] = nums[i];
               ans[1] = i+1;
            }
        }
        return ans;
    }
}