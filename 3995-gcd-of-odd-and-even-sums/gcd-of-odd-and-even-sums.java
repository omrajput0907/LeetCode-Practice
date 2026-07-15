class Solution {
   public static int gcd(int a, int b) {
        if(b%a==0){
            return a;
        }
        return gcd(b,a%b);
        
   }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);

        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         sumEven+=i;
        //     }else{
        //         sumOdd+=i;
        //     }
        // }
        return gcd(sumOdd,sumEven);

    }
}