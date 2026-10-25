class Solution {
    boolean palindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String a = s.substring(i,j+1);
                boolean isTrue=palindrome(s,i,j);
                if(isTrue && ans.length()<a.length()){
                    ans=a;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna