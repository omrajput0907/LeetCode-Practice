class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        StringBuilder s=new StringBuilder();
        int i=0,j=1,c=0;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                i++;
                j++;
                c++;
            }else{
                if(c==0){
                    s.append(chars[i]);
                    i++;
                    j++;
                }else{
                    c++;
                    s.append(chars[i]);
                    s.append(c);
                    i++;
                    j++;
                    c=0;
                }
            }
        }
        if(c>0){
            c++;
            s.append(chars[i]);
            s.append(c);
        }else{
             s.append(chars[i]);
        }
        for(int k=0;k<s.length();k++){
            chars[k]=s.charAt(k);
        }
        return s.length();
    }
}