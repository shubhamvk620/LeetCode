class Solution {
    public int maxDistance(int[] colors) {
        int i = 0;
        int j = colors.length-1;
        int ans = 0;
        while(i <= j){
            if(colors[i] == colors[j]){j--;}
            else{
                ans = Math.max(ans, Math.abs(i-j));
                i++; 
                j = colors.length-1; 
            }
        }
        return ans;
    }
}