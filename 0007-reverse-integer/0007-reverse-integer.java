class Solution {
    public int reverse(int x) {
        int dup = x;
        long rev = 0;// Use long to capture values outside the int range
        while(dup!=0){
            rev = (dup%10)+(rev*10);
            dup/=10;
            // Check if the current long value exceeds int bounds
          if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
    return 0;
}

        }
        return (int)rev; // Cast back to int before returning
    }
}