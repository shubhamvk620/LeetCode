class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        //first put 0, whose frequency is 1;
        map.put(0,1);
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int diff = sum - k;
            // agar map me ky hai toh uska frequency count me add;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            // map me sum or uska frequency put 
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
    return count;
    }
}