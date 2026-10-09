class Solution {
    public static int largest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int ele : arr){
            max=Math.max(ele,max);
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna