class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int digits=0;
            int a = nums[i];
            while(a!=0){
                digits++;
                a=a/10;
            }
            if(digits%2==0) count++;
        }
        return count;
    }
}