class Solution {
    public boolean canAliceWin(int[] nums) {
        int s_digit=0,d_digit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                s_digit+=nums[i];
            }else{
                d_digit+=nums[i];
            }
        }
        if(s_digit==d_digit){
            return false;
        }
        return true;

    }
}