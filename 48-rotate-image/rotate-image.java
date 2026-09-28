class Solution {
    void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[j][k];
            }
            k--;
        }
        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }

        int l=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                matrix[l][j]=arr[i][j];
            }
            l++;
        }
    }
}