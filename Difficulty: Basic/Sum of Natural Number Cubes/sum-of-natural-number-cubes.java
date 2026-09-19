class Solution {
    int sumOfSeries(int n) {
        // int ans=0;
        // for(int i=1;i<=n;i++){
        //     ans=ans+i*i*i;
        // }
        // return ans;
        int ans = (((n*n + n) / 2) * ((n*n + n) / 2));
        return ans;
    }
}