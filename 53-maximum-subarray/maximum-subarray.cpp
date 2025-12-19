class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxsum=INT_MIN;
        int currsum=0;
        
        for(int st=0;st<nums.size();st++){
            currsum+=nums[st];
            maxsum=max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }

            
        }
        return maxsum;        
    }
};