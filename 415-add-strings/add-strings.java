import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bi=new BigInteger(num1);
        
        BigInteger bi2=new BigInteger(num2);
        BigInteger sum=bi.add(bi2);

        // int first=Integer.parseInt(num1);
        // int second=Integer.parseInt(num2);
        // int sum=first+second;
        String result=""+sum;
        return result;
        
    }
}