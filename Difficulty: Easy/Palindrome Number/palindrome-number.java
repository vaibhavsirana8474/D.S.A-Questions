class Solution {
    public boolean isPalindrome(int n) {
        boolean istrue=true;
        int n1 = n;
        int n2 = 0;
        while(n!=0){
            int digit = n%10;
            n2=n2*10+digit;
            n=n/10;
        }
        if(n2!=n1){
            istrue=false;
        }
        return istrue;
    }
}