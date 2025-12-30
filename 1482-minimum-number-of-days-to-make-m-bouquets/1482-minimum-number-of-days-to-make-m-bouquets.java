class Solution {
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
                int flower = 0;
                int bouquets = 0;

                for(int j = 0; j < bloomDay.length; j++){
                    if(bloomDay[j] <= mid){
                        flower++;
                        if(flower >= k){bouquets++; flower = 0;}
                    } else flower = 0;
                }
                if(bouquets >= m){
                    ans = mid;
                    maxday = mid-1;
                     bouquets=0;
                }else {
                    minday = mid+1;
                    bouquets = 0;
                }
            }
            return ans;
    }
}