class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int[] ans = new int[n];
        ans[n-1] = -1;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                max = Math.max(max,arr[j]);
            }
            ans[i]=max;
            max = Integer.MIN_VALUE;
        }
        return ans;
    }
}