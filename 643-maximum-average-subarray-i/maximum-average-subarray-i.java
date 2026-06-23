class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        if(nums.length==1){
            return max;
        }
        double curr=max;
        for(int i=k;i<nums.length;i++){
            curr-=nums[i-k];
            curr+=nums[i];
            max=Math.max(curr,max);
        }
        return max/k;
    }
}