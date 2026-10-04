class Solution {
    public static Boolean canMakeBouquets(int[] arr, int day, int m, int k){
        int consecutiveFlowers=0;
        int bouquets=0;
        for (int bloom : arr) {
            if (bloom <= day) {
                consecutiveFlowers++;
                if (consecutiveFlowers == k) {
                    bouquets++;
                    consecutiveFlowers = 0;
                }
            } else {
                consecutiveFlowers = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k)  return -1;
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for(int ele : bloomDay){
            high = Math.max(high,ele);
            low = Math.min(low,ele);
        }
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canMakeBouquets(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
}