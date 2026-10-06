class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n=nums.length;
        int[] helper = new int[n];
        for(int i=0;i<n;i++){
            helper[nums[i]-1]=nums[i];
        }

        for(int i=0;i<n;i++){
            if(helper[i]==0) l.add(i+1);
        }


        // int i=1;
        // while(i<=n){
        //     boolean isTrue=false;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             isTrue=true;
        //         }
        //     }
        //     if(!isTrue){
        //         l.add(i);
        //     }
        //     i++;
        // }
        return l;
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna