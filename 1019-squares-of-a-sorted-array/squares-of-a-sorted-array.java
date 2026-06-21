class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]*=nums[i];
        }
        int i=0,j=n-1;
        while(i<n-1){
            if(i>=j){
                i++;
                j=n-1;
            }
            if(nums[i]>=nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }else if(nums[i]<=nums[j]){
                j--;
            }
            
        }
        return nums;
    }
}