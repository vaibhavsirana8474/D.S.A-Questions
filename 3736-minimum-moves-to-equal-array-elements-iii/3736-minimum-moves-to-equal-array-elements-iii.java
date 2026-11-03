class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int ele: nums){
           max = Math.max(max,ele);
        }

        int ans=0;
        for(int ele : nums){
            ans+=Math.abs(max-ele);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna