class Solution {
    public int thirdMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if(n<3) return arr[n-1];
        int count=3;
        int i = n-1;
        int ans = 0;
        while(i>=0){
            if((i-1)==-1 || arr[i]!=arr[i-1]){
                count--;
                if(count==0) ans=arr[i];
                if(count>0 && i==0) ans=arr[n-1];
                i--;
            }
            if(i>0 && arr[i]==arr[i-1]){
                i--;
            }
        }
        return ans;
    }
}