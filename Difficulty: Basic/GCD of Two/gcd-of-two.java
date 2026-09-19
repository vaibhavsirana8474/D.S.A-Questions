class Solution {
    public static int gcd(int a, int b) {
        // while(a!=0){
        //     int temp=a;
        //     a=b%a;
        //     b=temp;
        // }
        // return b;
        
        return (a==0)? b : gcd(b%a,a);
    }
}
