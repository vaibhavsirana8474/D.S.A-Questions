class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        List<Integer> ans=new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int i=0;
        int j=0;
        int dir=0;
        while(i>=0 && i<n && j>=0 && j<m){
            if(mat[i][j]==1){
                dir=(dir+1)%4;
                mat[i][j]=0;
            }
            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else{
                i--;
            }
        }
        if(dir==0){
            j--;
        }
        else if(dir==1){
            i--;
        }
        else if(dir==2){
            j++;
        }
        else {
            i++;
        }
        ans.add(i);
        ans.add(j);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna