class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int[][] matrix2=new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix2[j][i]=matrix[i][j];
            }
        }
        return matrix2;
    }
}