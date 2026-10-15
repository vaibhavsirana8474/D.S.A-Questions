class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int count=0;
        int totalsum=0;
        int leftsum=0;
        for(int ele:nums){
            totalsum+=ele;
        }

        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            int rightsum=totalsum-leftsum;
            if((leftsum-rightsum)%2==0){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna