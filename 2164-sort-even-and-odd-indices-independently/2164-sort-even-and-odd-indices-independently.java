class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();

        // adding even index value in a list named even.
        // adding odd index value in a list named odd.
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){ even.add(nums[i]);}
            else{odd.add(nums[i]);}
        }
        Collections.sort(even); //assending even list values.
        Collections.sort(odd, Collections.reverseOrder()); // decending odd list values.

        //adding sorted values to index.
        int e = 0, o = 0;
        for(int j = 0; j <nums.length; j++){
            if(j % 2 == 0){nums[j] = even.get(e); e++;}
            else{ nums[j] = odd.get(o); o++;}
        }
        return nums;
    }
}