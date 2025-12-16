class Solution {
    public void duplicateZeros(int[] arr) {
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0)
                c++;
        }
        int i = arr.length-1;
        int j = arr.length+c-1;

        for(int k = 0;k<arr.length;k++){
            if(i!=j&&i>=0){
                if(j<arr.length){
                    arr[j]=arr[i];
                }
                j--;
                if(arr[i]==0){
                    if(j<arr.length){
                        arr[j]=arr[i];
                    }
                    j--;
                }
                i--;
            }
        }
    }
}