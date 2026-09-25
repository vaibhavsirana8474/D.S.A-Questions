class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product=1;
        boolean isZero=false;
        int idx=0;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                isZero=true;
                zeroCount++;
                idx=i;
                continue;
            }
            product=product*nums[i];
        }
        if(isZero){
            if(zeroCount==1){
                for(int i=0;i<nums.length;i++){
                    if(i==idx) answer[i]=product;
                    else answer[i]=0;
                }
            }
            if(zeroCount>1){
                for(int i=0;i<nums.length;i++){
                    answer[i]=0;
                }
            }
        }
         else{
            for(int i=0;i<nums.length;i++){
            answer[i]=product/nums[i];
            }
        }
        return answer;
    }
}