
class Solution {
    public String[] findWords(String[] words) {
        List<String> l = new ArrayList<>();
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        for(String str: words){
            int[] arr=new int[3];
            for(char ch:str.toLowerCase().toCharArray()){
                if(a.indexOf(ch)!=-1){
                    arr[0]=1;
                }
                if(b.indexOf(ch)!=-1){
                    arr[1]=1;
                }
                if(c.indexOf(ch)!=-1){
                    arr[2]=1;
                }
            }
            int sum=arr[0]+arr[1]+arr[2];
            if(sum==1){
                l.add(str);
            }
        }

        String[] ans = new String[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna