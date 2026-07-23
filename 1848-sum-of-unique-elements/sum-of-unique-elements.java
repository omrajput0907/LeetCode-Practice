class Solution {
    public int sumOfUnique(int[] nums) {
        int[] f=new int[101];
        for(int i:nums){
            f[i]++;
        }
        int sum=0;
        for(int i=0;i<f.length;i++){
            if(f[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}