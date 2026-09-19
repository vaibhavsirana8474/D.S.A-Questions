class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        // if(n==2) return 1;
        int sum=0;
        int count=1;
        int a=0;
        int b=1;
        while(count!=n){
            sum=a+b;
            a=b;
            b=sum;
            count++;
        }
        return sum;
    }
}