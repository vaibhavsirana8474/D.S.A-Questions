class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int ans = Integer.MIN_VALUE;
        while(j<nums.length){
            if(nums[j]==1){
                j++;
            } 
            if((j==nums.length && nums[j-1]==1) || nums[j]!=1){
                count=j-i;
                ans = Math.max(ans,count);
                while(j!=nums.length && nums[j]!=1){
                    j++;
                }
                i=j;
            }
        }
        return ans;
    }
}