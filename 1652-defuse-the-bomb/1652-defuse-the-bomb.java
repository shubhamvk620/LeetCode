class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] arr = new int[n];
        if(k == 0){
           return arr;
        } 

        if(k > 0){
        for(int q = 0; q < arr.length; q++){
            int count = 0;
            int add = 0;
            int v = q;
            while(count < k){
                add += code[(v + 1)%n];
                v++;
                count++;
            }
            arr[q] = add;
        }
       }

         if(k < 0){
        for(int q = 0; q < arr.length; q++){
            int count = 0;
            int add = 0;
            int v = q;
            while(count < Math.abs(k)){
                add += code[(v - 1 +n)%n];
                v--;
                count++;
            }
            arr[q] = add;
        }
       }

       return arr;
    }
}