class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
         
         int sum = 0;
         for(int j = 0; j < nums.length; j++){
            if(map.get(nums[j]) == 1){
                sum += nums[j];
            }
         }
         return sum;
    }
}