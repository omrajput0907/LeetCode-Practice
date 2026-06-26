class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,i=0,right=0;
        for(int j=1;j<nums.length;j++){
            right+=nums[j];
        }
        while(i!=nums.length){
            if(left==right){
                return i;
            }
           
            left+=nums[i];
            i++;
            if(i!=nums.length){
                 right-=nums[i];
            }
           
        }
        return -1;
    }
}