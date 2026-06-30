class Solution {
    public void sortColors(int[] nums) {
        // space(n);
        // int[] color=new int[3];
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0){
        //         color[0]++;
        //     }else if(nums[i]==1){
        //         color[1]++;
        //     }else{
        //         color[2]++;
        //     }
        // }
        // int i=0
        // while(i<color.length){
        //     if()
        // }



        // space(1);


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