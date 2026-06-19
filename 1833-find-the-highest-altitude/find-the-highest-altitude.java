class Solution {
    public int largestAltitude(int[] gain) {
        int max_alt=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            max_alt=Math.max(max_alt,sum);
        }
        return max_alt;
    }
}