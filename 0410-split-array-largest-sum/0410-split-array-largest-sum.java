class Solution {
    public static boolean isvalid( int[] nums, int k, int max){
        int c = 1;
        int sum = 0;
       for(int j = 0; j < nums.length; j++){
        if(sum + nums[j]  <= max){
            sum += nums[j];
        }else{
             c++;
            sum = nums[j];      
        }
       }
       return c<=k;
    }
    public int splitArray(int[] nums, int k) {
        
        int first = 0;
         for(int o : nums){
            first = Math.max(first,o);
        }
        int  last = 0;
        for(int i = 0; i < nums.length; i++){
            last += nums[i];
        }
       

        int ans = -1;
        while(first <= last){
            int mid = first + (last-first)/2;
            if(isvalid(nums, k, mid)){
                ans = mid;
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return ans;
    }
}