class Solution {
    public static void subset(int[] nums,  HashSet<List<Integer>> ans,  List<Integer> curr, int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // add ith element before call
            curr.add(nums[i]);
            //pick call;
            subset(nums, ans, curr, i+1);

            // remove last element before backtrack
            curr.remove(curr.size()-1);
            //not pick call
             subset(nums, ans, curr, i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //sorting array so all dublicate came adjecent
        Arrays.sort(nums);

        // hashset that add list of integer that is unique bext it is hashSet
        HashSet<List<Integer>> ans = new HashSet<>();

        // curr add current index element
        List<Integer> curr = new ArrayList<>();

        subset(nums, ans, curr, 0);

        // add all new sets in new arratList to match return type
        return new ArrayList<>(ans);
    }
}