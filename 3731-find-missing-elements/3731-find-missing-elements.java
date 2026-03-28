class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list = new ArrayList<>();
        for(int k : nums){
            list.add(k);
        }
        Collections.sort(list);
        List<Integer>ans = new ArrayList<>();
        for(int i = list.get(0); i <= list.get(list.size()-1); i++){
            if(!list.contains(i))
            ans.add(i);
        }
        return ans;
    }
}