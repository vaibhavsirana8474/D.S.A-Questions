class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;

        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0;
                int k=i;
                while(i<haystack.length() && j<needle.length()){
                    if(haystack.charAt(k)!=needle.charAt(j)) break;
                    k++;
                    j++;
                }
                if(j==needle.length()) return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna