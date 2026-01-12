class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer>num1 = new HashSet<>();
      HashSet<Integer>num2 = new HashSet<>();

      for(int i : nums1){
        num1.add(i);
      }
      for(int j : nums2){
        num2.add(j);
      }
      List<Integer>list = new ArrayList<>();
     // int o = 0;
     for(int k : num1){
        if(num2.contains(k)){
            list.add(k);
        }
     }
     int[] arr = new int[list.size()];
     for(int l = 0; l < list.size(); l++){
        arr[l]=list.get(l);
     }
     return arr;
    }
}