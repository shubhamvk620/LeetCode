class Solution {
    public int countDigits(int num) {
        int count = 0;
        int nums = num;
        while(num > 0){
        int val = num%10;
            if(nums % val == 0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}