class Solution {
    // 1. Helper function
    public static void subset(int[] nums,  List<List<Integer>> ans,  List<Integer> curr, int i){
        if(i == nums.length){
            // "new ArrayList<>" kyu? Kyunki hume 'cur' ki copy chahiye, reference nahi.
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);//next call se pahle current element ko curr arraylist me add krna hai
        //pick ka call
        subset(nums, ans, curr, i+1);

        curr.remove(curr.size()-1);//backtrack krne se pahle last element remove
        //not pick ka call 
        subset(nums, ans, curr, i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {

        //since our return type is List of List so we create 2D ArrayList ans  jisme curr list add hoga
        List<List<Integer>> ans = new ArrayList<>();  

        // ArrayList curr jisme integer pick val add hoga 
        List<Integer> curr = new ArrayList<>();

        //method name 
        subset(nums, ans, curr, 0);

        return ans;
    }
}  