class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<n;i++){
            int ascii=(int)ransomNote.charAt(i)-(int)'a';
            arr1[ascii]++;
        }
        for(int i=0;i<m;i++){
            int ascii=(int)magazine.charAt(i)-(int)'a';
            arr2[ascii]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]>arr2[i]) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna