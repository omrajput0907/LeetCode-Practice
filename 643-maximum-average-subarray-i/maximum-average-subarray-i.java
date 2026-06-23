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
        int j=0;
        for(int i=k;i<nums.length;i++){
            curr-=nums[j++];
            curr+=nums[i];
            max=Math.max(curr,max);
        }
        return max/k;
    }
}