class Solution {
    public void bubbleSort(int[] arr) {
        // Arrays.sort(arr);
        for(int k=0;k<arr.length;k++){
            int i=0;
            int j=1;
            while(j<arr.length){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                i++;
                j++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna