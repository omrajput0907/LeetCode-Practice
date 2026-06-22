class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        while(i<nums.length){
            for(int j=0;j<nums.length;j++){
                if(nums[i]<=nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            i++;           
        }
    }
}