class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;

        int max=Integer.MIN_VALUE;
        for(int ele: nums){
            max=Math.max(max,ele);
        }
        int[] arr = new int[max];

        for(int i=0;i<n;i++){
            arr[nums[i]-1]++;
        }

        int sum=0;
        for(int i=0;i<max;i++){
            if(arr[i]==1){
                sum+=i+1;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna