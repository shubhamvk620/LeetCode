class Solution {

    public static boolean isvalid(int[] piles, int banana, int h){
        long hour = 0; 
        for(int k : piles){
           if(k % banana == 0){hour += (k / banana);}
           else{ hour += (k / banana)+1;}
        }
        return hour <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int minBanana = 1,  maxBanana= piles[0];
        for(int i : piles){
            maxBanana = Math.max(maxBanana, i);
        }
        int ans = -1;
        while(minBanana <= maxBanana){
            int mid = minBanana + (maxBanana - minBanana)/2;

            if(isvalid(piles, mid, h)){
                ans = mid;
                maxBanana = mid-1;
            }else{
                minBanana = mid +1;
            }
        }
        return ans;
    }
}