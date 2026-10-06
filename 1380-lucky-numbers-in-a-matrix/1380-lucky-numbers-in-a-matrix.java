class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int idx = 0;
            for(int j=0;j<matrix[i].length;j++){
                min=Math.min(min,matrix[i][j]);
                if(min==matrix[i][j]) {
                    idx=j;
                }
            }
            boolean istrue=true;
            for(int j=0;j<matrix.length;j++){
                if(min<matrix[j][idx]){
                    istrue=false;
                }
            }
            if(istrue){
                l.add(min);
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna