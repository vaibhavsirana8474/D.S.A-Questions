class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int i=0;
        while(i<nums.length){
            sum=sum+nums[i];
            i++;
        }
        int k =0;
        int sub_sum=0;
        while(k<nums.length){
            if(sum-sub_sum-nums[k]==sub_sum){
                return k;
            } 
            sub_sum=sub_sum+nums[k];
            k++;
        }
        return -1;
    }
}