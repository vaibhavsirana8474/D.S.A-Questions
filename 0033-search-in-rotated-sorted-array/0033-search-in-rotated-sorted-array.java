class Solution {
    public int search(int[] nums, int target) {
        // int idx=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         idx=i;
        //         break;
        //     }
        // }
        // return idx;

        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[i]){
                if(target>=nums[i] && target<=nums[mid]){
                    j=mid-1;
                } else{
                    i=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[j]){
                    i=mid+1;
                } else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna