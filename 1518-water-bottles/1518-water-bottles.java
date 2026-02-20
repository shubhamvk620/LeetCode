class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(ans >= numExchange){
            numBottles = numBottles + (ans/numExchange);
            ans = (ans/numExchange) + (ans%numExchange); 
        }
        return numBottles;
    }
}