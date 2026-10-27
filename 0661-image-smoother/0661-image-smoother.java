class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=img[i][j];
                int divisor=1;

                if(i-1>-1 && j-1>-1){
                    sum+=img[i-1][j-1];
                    divisor++;
                }
                if(i-1>-1){
                    sum+=img[i-1][j];
                    divisor++;
                }
                if(i-1>-1 && j+1<n){
                    sum+=img[i-1][j+1];
                    divisor++;
                }

                if(j-1>-1){
                    sum+=img[i][j-1];
                    divisor++;
                }
                if(j+1<n){
                    sum+=img[i][j+1];
                    divisor++;
                }

                if(i+1<m && j-1>-1){
                    sum+=img[i+1][j-1];
                    divisor++;
                }
                if(i+1<m){
                    sum+=img[i+1][j];
                    divisor++;
                }
                if(i+1<m && j+1<n){
                    sum+=img[i+1][j+1];
                    divisor++;
                }

                int p=sum/divisor;
                ans[i][j]=p;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna