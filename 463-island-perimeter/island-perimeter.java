class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(i+1<m && grid[i+1][j]==0){
                        c++;
                    }if(j+1<n && grid[i][j+1]==0){
                        c++;
                    }
                    if(i-1>=0 && grid[i-1][j]==0){
                        c++;
                    }
                    if(j-1>=0 && grid[i][j-1]==0){
                        c++;
                    }
                    if(i==0) c++;
                    if(j==0) c++;
                    if(j==n-1) c++;
                    if(i==m-1) c++;

                }
            }
        }
        return c;
    }
}