class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        String[] st = new String[n];
        for(int i=0;i<n;i++){
            int idx=indices[i];
            char val = s.charAt(i);
            st[idx]=val+"";
        }
        String ans = "";
        for(int i=0;i<n;i++){
            ans+=st[i];
        }
        return ans;
   }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna