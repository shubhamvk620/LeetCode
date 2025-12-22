class Solution {
    public int countHillValley(int[] nums) {
        List<Integer>list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i < nums.length;i++){
            if(nums[i]!=nums[i-1])
            list.add(nums[i]);
        }
        int count = 0;
        for(int j = 1; j < list.size()-1; j++){
            if((list.get(j) > list.get(j-1) && list.get(j) > list.get(j+1))||
            (list.get(j) < list.get(j-1) && list.get(j) < list.get(j+1))){
            count++;}

        }
        return count;
    }
}