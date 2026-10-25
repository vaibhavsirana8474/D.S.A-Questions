class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
            return "";
        }

        int nine = sum/9;
        int digit = sum%9;

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=nine;i++){
            sb.append('9');
        }
        if(digit>0 ){
            sb.append(digit);
        }

        while(sb.length()<num){
            sb.append('0');
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna