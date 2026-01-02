class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        int lastSpace =s.lastIndexOf(" ");
        int lastWordLength=s.length()-lastSpace;
        return lastWordLength-1;
    }
}   