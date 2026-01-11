class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int ans = 0;
        while(x > 0){
            int k = x % 10;
            ans = ans*10+k;
            x/=10;
        }
        if(ans != dup){
            return false;
        }
        return true;
    }
}