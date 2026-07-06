class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] flag=new int[26];
        for(int i=0;i<sentence.length();i++){
            int num=sentence.charAt(i);
            flag[num-97]++;
        }
        for(int i=0;i<flag.length;i++){
            if(flag[i]==0){
                return false;
            }
        }
        return true;
    }
}