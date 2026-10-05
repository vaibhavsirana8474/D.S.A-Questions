class Solution {
    public int countWords(String s) {
        String st = s.trim();
        if(st.length()==0) return 0;
        String[] ans = st.split("\\s+");
        return ans.length;
    }
}