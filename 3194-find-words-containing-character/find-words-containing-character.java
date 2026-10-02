import java.util.ArrayList;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        // String s = x+"";
        int i=0;
        for(String ele : words){
            if(ele.indexOf(x)!=-1){
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}