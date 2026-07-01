class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] expected=heights.clone();
        Arrays.sort(expected);
        int c=0;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}