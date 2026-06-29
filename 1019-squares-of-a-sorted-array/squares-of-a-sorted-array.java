class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] m = new int[n];
        int i = 0, j = n - 1, k = n - 1;
        while (i <= j) {
            if (nums[i] * nums[i] >= nums[j] * nums[j]) {
                m[k--] = nums[i] * nums[i];
                i++;
            } else if (nums[i] * nums[i] <= nums[j] * nums[j]) {
                m[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return m;
    }
}