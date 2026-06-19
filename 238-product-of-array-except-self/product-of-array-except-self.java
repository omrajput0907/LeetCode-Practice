class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1,n=nums.length;
        int[] lp=new int[n];
        int[] rp=new int[n];
        for(int i=0;i<n;i++){
            lp[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            rp[i]=product;
            product*=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=lp[i]*rp[i];
        }
        return nums;

    }
}