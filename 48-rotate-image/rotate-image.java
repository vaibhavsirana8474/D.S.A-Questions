class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<n;i++){
                arr[i][j]=matrix[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}