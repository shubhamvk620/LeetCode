class Solution {
    public int minimumRecolors(String blocks, int k) {
        int operation = 0;

        // first window
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W')
                operation++;
        }

        int ans = operation;

        int i = 0;
        for(int j = k; j < blocks.length(); j++){

            if(blocks.charAt(j) == 'W')
                operation++;

            if(blocks.charAt(i) == 'W')
                operation--;

            i++;

            ans = Math.min(ans, operation);
        }

        return ans;
    }
}