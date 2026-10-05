import java.util.*;
class Solution {
    public int compress(char[] chars) {
        // int idx=0;
        // int i=0;
        // int n = chars.length;
        // while(i<n){
        //     char ch = chars[i];
        //     int count=0;
        //     while(i<n && chars[i]==ch){
        //         count++;
        //         i++;
        //     }
        //     chars[idx]=ch;
        //     idx++;
        //     if(count>1){
        //         String s = Integer.toString(count);
        //         for(char c : s.toCharArray()){
        //             chars[idx++]=c;
        //         }
        //     }
        // }
        // return idx;

        int idx=0;
        int i=0;
        int n=chars.length;
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
                String st=Integer.toString(count);
                for(char c : st.toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna