class Solution {
    long dfs(int[][] arr,int i,int j){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]==0){
            return 0L;
        }

        long sum=arr[i][j];
        arr[i][j]=0;

        sum+=dfs(arr,i,j-1);
        sum+=dfs(arr,i,j+1);
        sum+=dfs(arr,i-1,j);
        sum+=dfs(arr,i+1,j);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    long sum=dfs(grid,i,j);
                    if(k!=0 && sum%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna