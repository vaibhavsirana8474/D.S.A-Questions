class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        int n=mat.length;
        int sum1=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum1+=mat[i][j];
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        l.add(sum1);
        int sum2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                sum2+=mat[i][j];
            }
        }
        l.add(sum2);
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna