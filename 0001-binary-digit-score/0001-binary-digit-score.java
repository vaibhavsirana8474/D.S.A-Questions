class Solution {
    public int calculateScore(int a, int b) {
        String p = Integer.toBinaryString(a);
        String q = Integer.toBinaryString(b);

        int s1=0;
        int s2=0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='1'){
                s1++;
            }
        }
        for(int i=0;i<q.length();i++){
            if(q.charAt(i)=='1'){
                s2++;
            }
        }
        
        return (s1>=s2)?s1*s2:s2/s1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna