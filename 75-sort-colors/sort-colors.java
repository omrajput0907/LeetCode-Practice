class Solution {
   
    public void sortColors(int[] nums) {
        int i=0,j=0,z=nums.length-1;
        while(j<=z){
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
                
            }else if(nums[j]==1){
                j++;
            }else if(nums[j]==2){
                int temp=nums[j];
                nums[j]=nums[z];
                nums[z]=temp;
                z--;                
            }
        }


        // space(1);
        // int i=0;
        // while(i<nums.length){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]<=nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        //     i++;           
        // }
    }
}