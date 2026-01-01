class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int ans = 0;

        for(int i = 0; i < gain.length; i++){
            if(altitude + gain[i] >= 0){
                ans = Math.max(ans, (altitude + gain[i]));
                altitude += gain[i];
            }else{
                altitude += gain[i];
            }
        }
        return ans;
    }
}