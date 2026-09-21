class Solution {
    public boolean check(int[] B) {
        int n = B.length;
        int[] A = new int[n];
        for(int p=0;p<n;p++){
            A[p]=B[p];
        }
        Arrays.sort(A);
        for(int x=0;x<n;x++){
            Boolean isTrue=true;
            for(int i=0;i<n;i++){
                if(B[i]!=A[(i+x)%n]){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue) return true;
        }
        return false;
    }
}