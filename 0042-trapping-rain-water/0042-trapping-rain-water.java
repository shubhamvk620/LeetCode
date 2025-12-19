class Solution {
    public int trap(int[] height) {
        int maxleft = 0;
        int maxright = 0;
        int totalwater = 0;
        int l = 0;
        int r = height.length-1;
        while (l < r){
            maxleft = Math.max(maxleft , height[l]);
            maxright = Math.max(maxright , height[r]);
            if(maxleft < maxright){
                totalwater += (maxleft - height[l]);
                l++;
            } else {
                totalwater += (maxright - height[r]);
                r--;
            }
        }
        return totalwater;
    }
}