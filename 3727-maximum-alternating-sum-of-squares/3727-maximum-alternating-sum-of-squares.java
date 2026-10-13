class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int p=0;p<nums.length;p++){
            if(nums[p]<0){
                nums[p]=-1*nums[p];
            }
        }
        Arrays.sort(nums);

        int n = nums.length/2;
        int[] arr1 = new int[n];
        int[] arr2 = new int[nums.length-n];
        int i=0;
        int j=n;
        while(i<nums.length && j<nums.length){
            if(i<n) arr1[i]=nums[i];
            arr2[i]=nums[j];
            i++;
            j++;
        }
        long negSum=0;
        long posSum=0;
        for(int p=0;p<n;p++){
            negSum+=arr1[p]*arr1[p];
        }
        for(int p=0;p<arr2.length;p++){
            posSum+=arr2[p]*arr2[p];
        }
        long score = posSum-negSum;
        return score;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna