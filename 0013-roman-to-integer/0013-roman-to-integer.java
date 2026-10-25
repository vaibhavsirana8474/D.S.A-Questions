class Solution {
    int roman(char ch){
    int ans = switch (ch) {
            case 'I' -> 0;
            case 'V' -> 1;
            case 'X' -> 2;
            case 'L' -> 3;
            case 'C' -> 4;
            case 'D' -> 5;
            case 'M' -> 6;
            default -> -1;
            };
        return ans;
    }
    public int romanToInt(String s) {
        int[] arr={1,5,10,50,100,500,1000};

        int j=s.length()-1;
        int ans=0;
        int p=-1;
        while(j>=0){
            char ch=s.charAt(j);
            int idx=roman(ch);
            if(j==s.length()-1) p=idx;
            if(idx<p){
                ans-=arr[idx];
            } else{
                ans+=arr[idx];
            }
            p=idx;
            j--;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna