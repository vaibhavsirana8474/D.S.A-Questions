class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
        int p=0;
        for(int j=n;j<2*n;j++){
            b[p++]=nums[j];
        }

        int q=0;
        for(int k=0;k<n;k++){
            ans[q++]=a[k];
            ans[q++]=b[k];
        }
        return ans;
    }
}