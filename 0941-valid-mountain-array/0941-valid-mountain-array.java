class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;
        int j = n - 1;

        // Move 'i' forward as long as the mountain is strictly increasing
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Move 'j' backward as long as the mountain is strictly decreasing
        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        // The logic for a valid mountain:
        // 1. They must meet at the same peak (i == j)
        // 2. The peak cannot be the first element (i > 0)
        // 3. The peak cannot be the last element (j < n - 1)
        return i > 0 && i == j && j < n - 1;
    }
}