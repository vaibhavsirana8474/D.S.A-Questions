class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            int price = prices[i];
            int discount=0;
            int j=i+1;
            while(j<prices.length){
                if(prices[j]<=price){
                    discount=prices[j];
                    break;
                }
                j++;
            }
            prices[i]=price-discount;
        }
        return prices;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna