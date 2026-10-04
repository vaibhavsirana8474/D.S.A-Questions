class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int size=Integer.MIN_VALUE;
        // for(int i : piles){
        //     size=Math.max(size,i);
        // }

        // int[] arr = new int[size];
        // int j=0;
        // for(int i=1;i<=size;i++){
        //     int hours=0;
        //     for(int ele : piles){
        //         hours+=Math.ceil((double)ele/(double)i);
        //     }
        //     arr[j++]=hours;
        // }
        // for(int i=0;i<size;i++){
        //     if(arr[i]==h) return (i+1);
        // }
        
        int max=Integer.MIN_VALUE;
        for(int ele: piles){
            max=Math.max(max,ele);
        }
        int min=1;
        int ans=0;
        while(min<=max){
            int mid=min+(max-min)/2;
            int count=0;
            for(int ele:piles){
                count+=Math.ceil((double)ele/(double)mid);
            }
            if(count>h){
                min=mid+1;
            } else{
                ans=mid;
                max=mid-1;
            }
        }
        return ans;
    }
}