class Solution {
    static int countSquares(int n) {
        int ans=1;
        for(int i=1;i<Math.sqrt(n);i++){
            int sqrt=i*i;
            if(sqrt<n){
                ans=i;
            }
        }
        return ans;
    }
}