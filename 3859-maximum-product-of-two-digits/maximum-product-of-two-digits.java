class Solution {
    public int maxProduct(int n) {
        int[] nums=new int[11];
        int i=0;
        while(n>0){
            int curr=n%10;
            nums[i++]=curr;
            n/=10;        
        }
        Arrays.sort(nums);
        int max=nums[nums.length-1]*nums[nums.length-2];
        return max;
    }
}