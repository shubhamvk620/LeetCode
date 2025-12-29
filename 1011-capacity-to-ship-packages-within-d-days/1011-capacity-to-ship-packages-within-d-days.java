class Solution {
    public int shipWithinDays(int[] weights, int days) {

       if(days > weights.length) return -1;

        //max load ka  min value
        int min = 0;
        for(int i = 0; i < weights.length; i++){
            if(min < weights[i])
            min = weights[i];
        }

        //  load maximim value ( sum of all load)
        int max = 0; 
        for(int j = 0; j < weights.length; j++){
            max += weights[j];
        }

        int ans = -1;

        while(min <= max){
            int mid = min+(max-min)/2; //mid, day and load all three value change and start from 
            int day = 1;               //new value for every next day so written inside loop 
            int minLoad = 0;

            // calculate minload of ship and day taken for laoding.    
            for(int k = 0; k < weights.length; k++){
                if(minLoad + weights[k] <= mid){
                minLoad += weights[k];
                }else {
                day++;
             minLoad = weights[k];}
            }
            // if possible then put mid in ans.
             if(day <= days){
                  ans = mid;
                max = mid-1;
              
             }else
            { min = mid+1;}

        }
        return ans;
    }
}