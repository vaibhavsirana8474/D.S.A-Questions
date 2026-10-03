class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        int[] ans = new int[26];
        for(int i=0;i<sentence.length();i++){
            int idx = (int)sentence.charAt(i)-(int)'a';
            ans[idx]++;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]<1) return false;
        }
        return true;
    }
}