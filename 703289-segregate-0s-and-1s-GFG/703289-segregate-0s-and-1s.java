class Solution {
    void segregate0and1(int[] arr) {
        int n=arr.length;
        int count0=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }
        }
        
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<n;i++){
            arr[i]=1;
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna