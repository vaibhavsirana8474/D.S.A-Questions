class Solution {
    int signFunc(long a){
        if(a%2==0) return 1;
        else return -1;
    }
    public int arraySign(int[] nums) {
        long x=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) count++;
            if(nums[i]==0) return 0;
        }
        return signFunc(count);
    }
}