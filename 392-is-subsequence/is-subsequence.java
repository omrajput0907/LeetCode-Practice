class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arrs=s.toCharArray();
        char[] arrt=t.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(i<t.length()&&j<s.length()){
            if(arrs[j]==arrt[i]){
                sb.append(arrt[i]);
                j++;
                i++;
                
            }else{
                i++;
                
            }
        }
        return s.equals(sb.toString());
    }
}