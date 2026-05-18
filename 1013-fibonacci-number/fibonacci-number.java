class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int i=0,j=1;
        int sum=0;
        for(int z=2;z<=n;z++){
            sum=i+j;
            i=j;
            j=sum;
        }
        return sum;
    }
}