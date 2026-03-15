class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] arr = new int[n];
        if(k == 0){
           return arr;
        } 

        if(k > 0){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int add = 0;
            int j = i;
            while(count < k){
                add += code[(j + 1)%n];
                j++;
                count++;
            }
            arr[i] = add;
        }
       }

         if(k < 0){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int add = 0;
            int j = i;
            while(count < Math.abs(k)){
                add += code[(j - 1 +n)%n];
                j--;
                count++;
            }
            arr[i] = add;
        }
       }

       return arr;
    }
}