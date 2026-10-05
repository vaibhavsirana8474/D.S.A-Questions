class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        s=s.toLowerCase();
        int i=0;
        int j=n/2;
        String vovel = "aeiou";
        int count1=0;
        int count2=0;
        while(i<n/2 && j<n){
            if(vovel.contains(s.charAt(i)+"")){
                count1++;
            }
            if(vovel.contains(s.charAt(j)+"")){
                count2++;
            }
            i++;
            j++;
        }
        return count1==count2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna