class Solution {
    public int mySqrt(int x) {
        long ans=0;
        for(long p=1;p*p<=x;p++){
            int i = (int)p;
            if(i*i==x) return i;
            if(i*i<x) ans=i;
        }
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna