class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        for(int ele1:nums1){
            for(int ele2:nums2){
                if(ele1==ele2){
                    ans[0]++;
                    break;
                }
            }
        }

        for(int ele2:nums2){
            for(int ele1:nums1){
                if(ele2==ele1){
                    ans[1]++;
                    break;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna