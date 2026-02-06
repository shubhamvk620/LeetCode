class Solution {
    //helper class for swaping
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
    //helper class for permute call
    public static void permute(int[] nums,  List<List<Integer>> ans, int i){
        //base case
        if(i == nums.length){
            // curr list in which base case result will come
            List<Integer> curr = new ArrayList<>();
            for(int a : nums) curr.add(a);
            ans.add(curr);
            return;
        }

        //looping
        for(int j = i; j < nums.length; j++){
            swap(nums, i, j); 
            permute(nums, ans, i+1);
            swap(nums,i, j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); // all ans save here
        permute(nums, ans, 0); // call jayega 
        return ans;
    }
}
// line 21 -> i & j will on same idx. 
// line 22 -> call goes for i+1 idx  and goes until i == nums.length
// base case hit -> the array that is being created goes to curr and then ans.
// After tha backtracking starts👇
// ➡️➡️ base case hit hua toh permute call for that i and j end
// ➡️➡️ then line 23 swap hoga or uske badd loop chalega or j++ hoga.

// means recursion call jab tak base casse hit nhi hot atab tak i and j same same rhega or looop nhi chaega means no j++

// when backtracking happens after base case tab loop chalega or j++ hoga and againg start from call . same process