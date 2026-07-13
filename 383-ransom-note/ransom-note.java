class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean[] ran_note=new boolean[ransomNote.length()];
        boolean[] mag_ine=new boolean[magazine.length()];

        for(int i=0;i<ran_note.length;i++){
            ran_note[i]=false;
        }
         for(int i=0;i<mag_ine.length;i++){
            mag_ine[i]=false;
        }
        for(int i=0;i<ran_note.length;i++){
            for(int j=0;j<mag_ine.length;j++){
                if(ransomNote.charAt(i)==magazine.charAt(j) && mag_ine[j]==false){
                    ran_note[i]=true;
                    mag_ine[j]=true;
                    break;
                }
            }
        }
        for(int i=0;i<ran_note.length;i++){
            if(ran_note[i]==false){
                return false;
            }
        }
        return true;

    }
}