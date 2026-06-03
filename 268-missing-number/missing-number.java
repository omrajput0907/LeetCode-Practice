class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(sum==nums[i]){
                sum++;
            }
            else{
                break;
            }
        }
        return sum;
    }
}