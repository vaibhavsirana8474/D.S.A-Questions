class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<10 && nums[i]>=0){
                digitsum+=nums[i];
            } else{
                while(nums[i]!=0){
                    int digit=nums[i]%10;
                    digitsum+=digit;
                    nums[i]=nums[i]/10;
                }
            }
        }
        int diff = Math.abs(sum-digitsum);
        return diff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna