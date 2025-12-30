class Solution {
    public int findGCD(int[] nums) {
     Arrays.sort(nums);
     int diviser = nums[0]; 
     int divident = nums[nums.length-1];

     if(divident % diviser == 0 ) {return diviser;}
     else {
       
        while (divident % diviser != 0){
             int remainder = (divident % diviser);
            divident = diviser;
            diviser = remainder;
        }
     }
       return diviser;
     
    }
}