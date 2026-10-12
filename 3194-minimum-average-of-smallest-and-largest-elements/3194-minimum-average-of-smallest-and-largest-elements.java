class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double[] ans = new double[n/2];
        for(int i=0;i<n/2;i++){
            ans[i]=(double)(nums[i]+nums[n-i-1])/2;
        }
        double min = Integer.MAX_VALUE;
        for(int i=0;i<n/2;i++){
            min=Math.min(min,ans[i]);
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna