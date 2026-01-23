class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;
        int j = n - 1;
        //increase i jab tak wo last index k 1 pahle na pahunch jaye && arr[i+1] > arr[i] always
        while (i < n-1 && arr[i] < arr[i + 1]) {
            i++;
        }
        //decrease j jabtak j 1st endex pe na pahunch jaye and arr[j] > arr[j-1] always.
        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return i > 0 && i == j && j < n - 1;
    }
}