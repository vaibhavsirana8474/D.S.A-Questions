class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        // int[] ans = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=0;j<=i;j++){
        //         sum=sum+nums[j];
        //     }
        //     ans[i]=sum;
        // }
        // return ans;
        return nums;
    }
}