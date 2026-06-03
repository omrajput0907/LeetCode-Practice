class Solution {
    public int smallestIndex(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            int sum_digit=0;
            while(nums[i]!=0){
                sum_digit+=nums[i]%10;
                nums[i]/=10;
            }
            if(sum_digit==i){
                index=i;
                break;
            }
        }
        return index;
    }
}