class Solution {
    public long nPr(int n, int r) {
        long prod=1;
        for(int i=n;i>(n-r);i--){
            prod=prod*i;
        }
        return prod;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna