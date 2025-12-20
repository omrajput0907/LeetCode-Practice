class Solution {
public:
    bool isPalindrome(int x) {
        int j=x;
        long reverse=0;
        while(x!=0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x/=10;
        }
        if(j==reverse && j>=0){
            return true;
        }
        return false;
    }
};