class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       for(int j = 0; j < matrix.length; j++){
    for(int i = 0; i < matrix[j].length / 2; i++) {
        int temp = matrix[j][i];
        matrix[j][i] = matrix[j][matrix[j].length - i - 1];
        matrix[j][matrix[j].length - i - 1] = temp;
    }
}
   
   
   
    }
}