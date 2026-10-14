class Solution {
    public int earliestTime(int[][] tasks) {
        int ans=Integer.MAX_VALUE;
        int n=tasks.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<2;j++){
                sum+=tasks[i][j];
            }
            ans=Math.min(ans,sum);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna