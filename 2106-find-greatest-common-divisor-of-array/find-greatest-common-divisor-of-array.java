class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        for(int i=0;i<n;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        while(min!=0){
            int temp=max%min;
            max=min;
            min=temp;

        }
        return max;
    }
}