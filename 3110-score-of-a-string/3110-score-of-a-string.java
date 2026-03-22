class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        char[] ch = s.toCharArray();
       for(int i = 1; i < ch.length; i++){
        ans += Math.abs(ch[i-1] - ch[i]);
       }
        return ans;
    }
}