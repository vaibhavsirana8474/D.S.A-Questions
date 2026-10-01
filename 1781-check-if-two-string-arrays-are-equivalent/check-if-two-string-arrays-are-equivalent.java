class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for(String ele : word1){
            a+=ele;
        }
        for(String ele: word2){
            b+=ele;
        }
        return a.equals(b);
    }
}