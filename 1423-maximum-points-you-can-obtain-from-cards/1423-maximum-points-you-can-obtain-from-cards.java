class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        for(int i = k-1; i >= 0; i--){
            left += cardPoints[i];
        }

        int m = k-1;
        int j = cardPoints.length-1;
        int max = 0;
        while(m >= 0){
            max = Math.max(max,left);
            left -= cardPoints[m];
            left += cardPoints[j];
            m--;
            j--;
        }
        return Math.max(max,left);
    }
}