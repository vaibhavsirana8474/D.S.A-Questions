class Solution {
    public int countDays(String s){
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int Month=Integer.valueOf(s.substring(0,2));
        int Date=Integer.valueOf(s.substring(3));

        int ans=0;
        for(int i=0;i<Month-1;i++){
            ans+=arr[i];
        }
        ans+=Date;
        return ans;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startDate=Math.max(countDays(arriveAlice),countDays(arriveBob));
        int leaveDate=Math.min(countDays(leaveAlice),countDays(leaveBob));

        if(startDate>leaveDate) return 0;
        return leaveDate-startDate+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna