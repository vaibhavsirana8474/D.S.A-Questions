class Solution {
    public int[] countOddEven(int[] arr) {
        int[] a=new int[2];
        for(int ele : arr){
            if(ele%2!=0){
                a[0]++;
            } else{
                a[1]++;
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna