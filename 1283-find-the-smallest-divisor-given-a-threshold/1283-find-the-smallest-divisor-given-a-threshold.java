class Solution {
     public static boolean isvalid(int[] nums, int threshold, int value){
            int sum = 0;
            for(int j = 0; j < nums.length; j++){
                sum += Math.ceil((double)nums[j]/value);
            }
            return sum <= threshold;
            }
    public int smallestDivisor(int[] nums, int threshold) {
        
        int first = 0, last =nums[0];
        for(int i : nums){
           // first = Math.min(first, i);
            last = Math.max(last, i);
        } 
        int ans = -1;
        while(first <= last){
            int mid = first+(last-first)/2;
            if(isvalid(nums, threshold, mid)){
                ans = mid;
                last = mid -1;
            }else{
                first = mid +1;
            }

        }
       return ans;
    }
}