class Solution {
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][][] ans = new int[m][n][1024];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(i==0 && j==0){
                    ans[0][0][grid[0][0]]=1;
                }

                if(j-1>=0 && i-1>=0){
                    for(int k=0;k<1024;k++){
                        if(ans[i][j-1][k]==1){
                            int a = grid[i][j]^k;
                            ans[i][j][a]=1;
                        }
                    }
                    for(int k=0;k<1024;k++){
                        if(ans[i-1][j][k]==1){
                            int a = grid[i][j]^k;
                            ans[i][j][a]=1;
                        }
                    }
                }

                if(i-1<0 && j-1>=0){
                    for(int k=0;k<1024;k++){
                        if(ans[i][j-1][k]==1){
                            int a = grid[i][j]^k;
                            ans[i][j][a]=1;
                        }
                    }
                }

                if(j-1<0 && i-1>=0){
                    for(int k=0;k<1024;k++){
                        if(ans[i-1][j][k]==1){
                            int a = grid[i][j]^k;
                            ans[i][j][a]=1;
                        }
                    }
                }
            }
        }

        for(int i=0;i<1024;i++){
            if(ans[m-1][n-1][i]==1){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna