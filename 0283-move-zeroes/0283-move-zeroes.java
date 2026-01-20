class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer>list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        int s = 0;
        int i = 0;
        int j = nums.length-1;
        while(s < list.size()){
            if(list.get(s) != 0){
                nums[i]=list.get(s);
                i++;
            }
            else{
                nums[j]=list.get(s);
                j--;
            }
            s++;
        }
    }
}