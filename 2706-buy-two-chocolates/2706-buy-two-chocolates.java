class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int m=money;
        if(prices[0]>money) return money;
        money=money-prices[0];
        money=money-prices[1];
        if(money>-1){
            return money;
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna