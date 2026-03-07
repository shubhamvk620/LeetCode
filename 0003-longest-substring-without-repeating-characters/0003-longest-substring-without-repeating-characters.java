class Solution {
    public int lengthOfLongestSubstring(String s) {
    int i = 0; int j = 0;
    int longest = 0;
    Set<Character>set = new HashSet<>();
    while(j < s.length()) {
        if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j));
            longest = Math.max(set.size(),longest);
            j++;
        }else{
            set.remove(s.charAt(i));
            i++;
        }
    }   
    return longest;
    }
}