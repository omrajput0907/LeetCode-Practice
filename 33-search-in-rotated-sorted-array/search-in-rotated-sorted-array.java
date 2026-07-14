class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[i]==target){
                return i;
            }
            if(nums[j]==target){
                return j;
            }
            if(nums[mid]==target){
                return mid;
            }
            if(nums[i]<nums[mid] && target<nums[mid] && target >=nums[i]){
                j=mid-1;
            }else if(nums[j]>nums[mid] && target>nums[mid] && target <=nums[j]){
                i=mid+1;
            }else{
                i++;
                j--;
            }
            
        }
        if(i>=j && target == nums[i]){
            return i;
        }
        return -1;
    }
}