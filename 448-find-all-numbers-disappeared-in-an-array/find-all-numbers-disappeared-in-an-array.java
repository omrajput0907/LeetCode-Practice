class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(correct >nums.length-1){
                i++;
            }
            else if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        ArrayList li=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1!=j){
                li.add(j+1);
            }
        }
        return li;
    }
}