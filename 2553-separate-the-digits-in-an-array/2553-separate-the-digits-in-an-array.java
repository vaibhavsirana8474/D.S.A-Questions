class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        String s = "";
        for(int i=0;i<n;i++){
            s+=Integer.toString(nums[i]);
        }
        int[] ans = new int[s.length()];
        for(int i=0;i<ans.length;i++){
            int digit = (int)(s.charAt(i)-'0');
            ans[i] = digit;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna