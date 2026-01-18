class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                return digits;
            }
        } 
        int[] ans = new int[n+1];
        int c = 0;
       for(int j = 0; j < n; j++){
            if(digits[j]==0){c++;}
            if(c==n){ans[0]=1;}
       }
       return ans;
    }
}