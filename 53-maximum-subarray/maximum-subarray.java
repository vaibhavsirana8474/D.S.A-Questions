class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int sum=0;
         for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max_sum=Math.max(sum,max_sum);
            if(sum<0){
                sum=0;
            }
            // for(int j=i;j<nums.length;j++){
            //     sum=sum+nums[j];
            //     max_sum=Math.max(max_sum,sum);
            // }
        }
        return max_sum;
    }
}