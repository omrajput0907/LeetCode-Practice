class Solution {
    public int findDuplicate(int[] nums) {
         int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[correct]==nums[i]){
                return nums[correct];
            }
            if(correct >nums.length-1){
                i++;
            }
            else if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
       
        return -1;
    }
}