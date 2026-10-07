class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length,m=arr[0].length;
        int firstrow=0,lastrow=n-1;
        int firstcolumn=0,lastcolumn=m-1;
        List<Integer> al = new ArrayList<>();
        while(firstrow<=lastrow || firstcolumn<=lastcolumn){
            //Left to Right
            for(int i=firstcolumn;i<=lastcolumn;i++){
                al.add(arr[firstrow][i]);
            }
            firstrow++;
            if(firstrow>lastrow || firstcolumn>lastcolumn) break;

            //Up to Down
            for(int i=firstrow;i<=lastrow;i++){
                al.add(arr[i][lastcolumn]);
            }
            lastcolumn--;
            if(firstrow>lastrow || firstcolumn>lastcolumn) break;

            //Right to Left
            for(int i=lastcolumn;i>=firstcolumn;i--){
                al.add(arr[lastrow][i]);
            }
            lastrow--;
            if(firstrow>lastrow || firstcolumn>lastcolumn) break;

            //Down to Up
            for(int i=lastrow;i>=firstrow;i--){
                al.add(arr[i][firstcolumn]);
            }
            firstcolumn++;
        }
        return al;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna