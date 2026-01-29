class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
       List<Integer>lists = new ArrayList<>(set);
        Collections.sort(lists);
      
      int n = lists.size();
      if(n < 3){
        return lists.get(n-1);
      }
      return lists.get(n-3);
    }
}