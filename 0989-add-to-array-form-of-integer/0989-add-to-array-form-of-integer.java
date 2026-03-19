class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer>list = new ArrayList<>();
        int i = nums.length-1;
        int carry = 0;
        while(i >= 0 || k > 0 || carry > 0){
            int sum = carry;

            if( i >= 0){
                sum += nums[i];
                i--;
            }

            if( k > 0){
               sum += k%10;
               k/=10; 
            }
            list.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(list);
        return list;
    }
}