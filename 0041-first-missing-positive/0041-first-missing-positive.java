class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){

            
            if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length){i++;}
            else{
                int temp = nums[i]; // temp mein wo value rakhi jise swap karna hai
                nums[i] = nums[temp-1]; //jise swap krna hai uski sahi index pe jo value baitha use nums[i] me put kro
                nums[temp-1] = temp; // temp ko uski sahi seat par baitha diya

                //agar sawp krne k baar value swap value or placed value sdame hai toh i++
            if(nums[i] == nums[temp-1])i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j]!= j+1)
            return j+1;
        }
        return nums.length+1;
    }
}