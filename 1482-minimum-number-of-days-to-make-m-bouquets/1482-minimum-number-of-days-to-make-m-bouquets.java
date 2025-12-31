class Solution {
    public static boolean isvalid(int[] bloomDay, int m, int k, int day){
             int flower = 0;
                int bouquets = 0;
         for(int j = 0; j < bloomDay.length; j++){
                    if(bloomDay[j] <= day){
                        flower++;
                        if(flower >= k){bouquets++; flower = 0;}
                    } else flower = 0;
                }
                return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k > bloomDay.length){ return -1;}

           int minday = bloomDay[0], maxday = bloomDay[0];
            for (int i = 1; i < bloomDay.length; i++) {
                minday = Math.min(minday, bloomDay[i]);
                maxday = Math.max(maxday, bloomDay[i]);
            }

            int ans = -1;
            while( minday <= maxday){
                int mid = minday + (maxday-minday)/2;
               

               
                if(isvalid(bloomDay, m, k, mid)){
                    ans = mid;
                    maxday = mid-1;
                }else {
                    minday = mid+1;
                }
            }
            return ans;
    }
}