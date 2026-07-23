class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        int min=nums[0];
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[j]==nums[mid]){
                 if(nums[mid]<min){
                    min=nums[mid];
                    
                }
                j--;
            }
            else if(nums[i]==nums[mid]){
                if(nums[i]<min){
                    min=nums[i];
                    
                }
                i++;
            }
            else if(nums[i]<=nums[mid]){
                if(nums[i]<min){
                    min=nums[i];
                    
                }
                i=mid+1;
            }else if(nums[j]>=nums[mid]){
                if(nums[mid]<min){
                    min=nums[mid];
                    
                }
                j=mid-1;
            }
        }
        return min;
        
    }
}