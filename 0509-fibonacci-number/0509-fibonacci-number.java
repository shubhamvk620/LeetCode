class Solution {
    public int fib(int n) {
        // base case
        if( n < 2){
            return n;
        }
        // recursive call 
        return fib(n-1) + fib(n-2);
    }
}   