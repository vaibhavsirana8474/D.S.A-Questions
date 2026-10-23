class Solution {
    public int peakElement(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(i<n-1 && (nums[i]>nums[i-1] && nums[i]>nums[i+1])){
                return i;
              }
            if(i==(n-1)){
                if(nums[i]>nums[i-1]){
                    return i;
                }
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna