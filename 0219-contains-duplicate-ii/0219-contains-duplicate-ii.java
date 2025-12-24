class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                int currIndex = map.get(num);
                if(Math.abs(currIndex - index) <= k){

                    return true;
                }
            }
            
            map.put(num, index);
            index++;
        }
        return false;
    }
}