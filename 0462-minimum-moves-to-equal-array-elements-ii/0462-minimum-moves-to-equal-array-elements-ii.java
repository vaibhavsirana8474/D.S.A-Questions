class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0+(nums.length-1)/2;
        int ele=nums[mid];

        int ans=0;
        for(int num : nums){
            ans+=Math.abs(num-ele);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna