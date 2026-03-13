class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double add = 0;
        int j = 0;
        while(j < k){
            add += nums[j];
            j++;
        }
        double ans = add/k;
        int i = 0;
        while( j < nums.length){
            add -= nums[i];
            add += nums[j];
             
             ans = Math.max(ans, (add/k));
             i++;
             j++;
        }
        return  Math.max(ans, (add/k));
    }
}