class Solution {
    public int majorityElement(int[] nums) {
       int fq=0;
       int current=nums[0];
       for(int i=0;i<nums.length;i++){
        if(fq==0){
            current=nums[i];
        }
        if(current==nums[i]){
            fq++;
        }
        else if(current!=nums[i]){
            fq--;
        }
        
       }
       return current;
    }
}