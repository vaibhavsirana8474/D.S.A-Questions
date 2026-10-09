class Solution {
    public boolean canAliceWin(int[] nums) {
        boolean isTrue=false;
        int bobsum=0;
        int alicesum=0;
        for(int ele : nums){
            if(ele<10){
                alicesum+=ele;
            } else{
                bobsum+=ele;
            }
        }
        if(alicesum>bobsum) isTrue=true;

        bobsum=0;
        alicesum=0;
        for(int ele:nums){
            if(ele<100 && ele>9){
                alicesum+=ele;
            } else{
                bobsum+=ele;
            }
        }
        if(alicesum>bobsum) isTrue=true;

        return isTrue;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna