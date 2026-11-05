class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int start=0;
            int end=arr2.length-1;
            boolean isValid=true;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(Math.abs(arr2[mid]-arr1[i])<=d){
                    isValid=false;
                    break;
                } else if(arr2[mid]<arr1[i]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
            if(isValid) count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna