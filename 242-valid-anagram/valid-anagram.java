class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // int[] s1 = new int[s.length()];
        // int[] s2 = new int[t.length()];
        // for(int i=0;i<s.length();i++){
        //     int a = (int)s.charAt(i);
        //     int b = (int)t.charAt(i);
        //     s1[i]=a;
        //     s2[i]=b;
        // }
        // Arrays.sort(s1);
        // Arrays.sort(s2);
        // for(int i=0;i<s1.length;i++){
        //     if(s1[i]!=s2[i]) return false;
        // }
        // return true;
        int[] ans = new int[26];
        for(int i=0;i<s.length();i++){
            int idx1 =(int)s.charAt(i) - (int)'a';
            ans[idx1]++;
        }

        for(int i=0;i<t.length();i++){
            int idx2 = (int)t.charAt(i)-(int)'a';
            ans[idx2]--;
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0) return false;
        }
        return true;
    }
}