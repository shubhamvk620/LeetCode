class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        int i = 0;
        int p = k;
        //starting
        while(p > 0){
            temp[i] = nums[n-p];
            i++;p--;
        }
        int j = 0;
        while( i < n){
            temp[i++] = nums[j++];
        }
       //back to nums
       for(int x = 0; x < n; x++){
        nums[x] = temp[x];
       }
    }
}