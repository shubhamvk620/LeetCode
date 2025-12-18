class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
         int area= 0;
        int i = 0;
        int j = height.length-1;
        while(i < j){
           
           if(height[i] < height[j]){
         area = ((j-i)*height[i]);
            maxarea = Math.max(maxarea,area);
            i++;
            } else{ 
             area = ((j-i)*height[j]);
          maxarea = Math.max(maxarea,area);
          j--;}
        }
        return maxarea;
    }
}