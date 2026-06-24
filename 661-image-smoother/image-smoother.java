class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length,n=img[0].length;
        int [][] result=new int[m][n];
        for(int i=0;i<m;i++){
           
            for(int j=0;j<n;j++){
                 int sum=0;
                 int c=0;
                if(i-1>=0){
                    sum+=img[i-1][j];
                    c++;
                } if(i-1>=0 && j-1>=0){
                    sum+=img[i-1][j-1];
                    c++;
                } if(j-1>=0){
                    sum+=img[i][j-1];
                    c++;
                } if(i+1<m){
                    sum+=img[i+1][j];
                    c++;
                } if(i+1<m && j-1>=0){
                    sum+=img[i+1][j-1];
                    c++;
                } if(i+1<m && j+1<n){
                    sum+=img[i+1][j+1];
                    c++;
                } if(j+1<n){
                    sum+=img[i][j+1];
                    c++;
                } if(i-1>=0 && j+1<n){
                    sum+=img[i-1][j+1];
                    c++;
                }
                sum+=img[i][j];
                c++;
                result[i][j]=sum/c;
            }
           
        }
        return result;
    }
}