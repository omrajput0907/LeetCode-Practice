class Solution {
    public boolean halvesAreAlike(String s) {
        int[] arr={'a', 'e','i', 'o', 'u'};
        int count=0,count2=0;
        char[] c=s.toCharArray();
        int i=0,j=c.length/2;
        while(i<j){
            char ch=Character.toLowerCase(c[i]);
            if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                count++;
                
            }
            i++;
        }
        while(j<s.length()){
            char ch=Character.toLowerCase(c[j]);
            if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                count2++;
                
            }
            j++;
        }
        return count==count2;

        
    }
}