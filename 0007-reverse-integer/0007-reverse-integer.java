class Solution {
    public int reverse(int x) {
        int dup = x;
        long rev = 0;
        while(dup!=0){
            rev = (dup%10)+(rev*10);
            dup/=10;
          if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
    return 0;
}

        }
        return (int)rev;
    }
}