class Solution {
    static boolean armstrongNumber(int n) {
        int ans=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            ans=ans+digit*digit*digit;
            temp=temp/10;
        }
        if(n==ans){
            return true;
        }
        return false;
    }
}