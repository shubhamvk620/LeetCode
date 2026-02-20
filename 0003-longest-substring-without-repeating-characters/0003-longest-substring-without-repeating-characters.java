class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        char[] c = s.toCharArray();  
        HashSet<Character>set = new HashSet<>();
        for(int i = 0; i < c.length; i++){
           for(int j = i; j < c.length; j++){
                 if(!set.contains(c[j])){
                set.add(c[j]);
            }else{
                size = Math.max(size, set.size());
                set.clear();
                break;
            }
           }
        }
        return Math.max(size,set.size());
    }
}