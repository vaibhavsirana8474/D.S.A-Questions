class Solution {
    public int sortPermutation(int[] nums) {
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                k=(k & nums[i]);
            }
        }
        return (k==-1)?0:k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna