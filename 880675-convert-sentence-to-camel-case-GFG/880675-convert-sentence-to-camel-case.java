import java.util.*;
class Solution {
    public String convertToCamelCase(String s) {
        StringBuilder st = new StringBuilder();
        String[] arr = s.split("\\s+");
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i==0){
                st.append(arr[0]);
                
            } else{
                st.append(Character.toUpperCase(arr[i].charAt(0)));
                st.append(arr[i].substring(1));
            }
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna