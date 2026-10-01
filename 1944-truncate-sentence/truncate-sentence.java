import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        List<String> l = new ArrayList<>();
        int i=0;
        while(i<n){
            String temp="";
            while(i!=(n-1) && (!s.substring(i,i+1).equals(" "))){
                temp+=s.charAt(i);
                i++;
                if(i==(n-1)){
                    temp+=s.charAt(i);
                    break;
                }
            }
            l.add(temp);
            i++;
        }
        String ans = "";
        for(int j=0;j<k-1;j++){
            ans+=l.get(j)+" ";
        }
        ans+=l.get(k-1);
        return ans;
    }
}