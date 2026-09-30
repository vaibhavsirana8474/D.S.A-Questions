class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        int ans=Integer.MIN_VALUE;
        arr[0]=0;
        for(int i=0;i<n;i++){
            arr[i+1]=gain[i]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
}