class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            System.out.println(nums[nums.length-1]);
        }
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]==0){
                j++;
            }
            if(j<nums.length && (nums[i]==0 && nums[j]!=0)){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            if(j<nums.length && (nums[i]!=0 && nums[j]==0)){
                i++;
                j++;
            }
            if(nums[nums.length-1]==0 && j==nums.length-1){
                break;
            }
            if(nums[j-1]!=0 && j==nums.length-1){
                break;
            }
            if(nums[j-1]!=0 && j!=nums.length-1){
                i++;
                j++;
            }

        }
    }
}