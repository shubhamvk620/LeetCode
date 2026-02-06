class Solution {
    //helper class for swaping
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
    //helper class for permute call
    public static void permuteUnique(int[] nums,  Set<List<Integer>> ans, int i){
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
            permuteUnique(nums, ans, i+1);
            swap(nums,i, j);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>(); // all ans save here
        permuteUnique(nums, ans, 0); // call jayega 
        
        return new ArrayList<>(ans);
    }
}

// same as permutation 1 -> Q.no 46
//change at line 27 👇
        // List of List ki jagha hashSet of List create kea gaya hai.
        // when List of curr get dublicate lists so when we add curr in ans then due to hashSet dublicate will not being added

        // in line 30 -> since return type is List<List<Integer>> and our ans is List<List<Integer>> so creating a new ArrayList and adding ans in that so return type matches.

        //➡️ means hashset me curr List ko nikal kr new ArrayList banaye hai usme insert kea ja rha hai.