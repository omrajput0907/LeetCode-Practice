class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        while (j < n && nums[j] < 0) {
            j++;
        }
        int i = j - 1;
        int k = 0;
        while (i >= 0 && j < n) {
            if (nums[i] * nums[i] <= nums[j] * nums[j]) {
                ans[k++] = nums[i] * nums[i];
                i--;
            } else {
                ans[k++] = nums[j] * nums[j];
                j++;
            }
        }
        while (i >= 0) {
            ans[k++] = nums[i] * nums[i];
            i--;
        }
        while (j < n) {
            ans[k++] = nums[j] * nums[j];
            j++;
        }

        return ans;
    }
}