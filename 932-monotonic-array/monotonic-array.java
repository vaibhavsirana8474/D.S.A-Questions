class Solution {
    public boolean isMonotonic(int[] arr) {
        if(arr.length<2) return true;
        boolean isDecreasing=true;
        boolean isIncreasing=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                isIncreasing = false;
            }
            if(arr[i]>arr[i-1]){
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}