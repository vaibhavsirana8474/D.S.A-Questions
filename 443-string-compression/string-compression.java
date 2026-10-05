import java.util.*;
class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int i=0;
        int n = chars.length;
        while(i<n){
            char ch = chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            chars[idx]=ch;
            idx++;
            if(count>1){
                String s = Integer.toString(count);
                for(char c : s.toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}