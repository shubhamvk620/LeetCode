class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap();
        for(int i = 0; i < names.length; i++){
            map.put(heights[i],names[i]);
        }
        
        Arrays.sort(heights);

   // reverse
         for(int i = 0; i < heights.length/2; i++){
         int temp = heights[i];
        heights[i] = heights[heights.length - 1 - i];
        heights[heights.length - 1 - i] = temp;
        }

        String[] ans = new String[names.length];

        for(int i = 0; i < heights.length; i++){
            ans[i] = map.get(heights[i]);
        }

        return ans;
    }
}