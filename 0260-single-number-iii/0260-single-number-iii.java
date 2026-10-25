class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            boolean left=((i-1)<0 || nums[i]!=nums[i-1]);
            boolean right=((i+1)>=nums.length || nums[i]!=nums[i+1]);
            if(left==true && right==true){
                l.add(nums[i]);
            }
        }
        int[] ans = new int[l.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna