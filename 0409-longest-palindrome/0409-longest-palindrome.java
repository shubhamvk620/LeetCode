class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);//agar map me char presen hai then value me +1 else value   assigen 0
        }
        int ans = 0 ;
        boolean check = false;//check krega agar odd count present hai toh true ho jayega 
        for(int i : map.values()){
            if(i % 2 == 0){ ans += i;}
            else {ans += (i-1); check = true;} // present odd cout tne true .
        }
        return check?ans+=1:ans;// if true then ans me +1 krke return ans & if not then only ans without +1;
    }
}   