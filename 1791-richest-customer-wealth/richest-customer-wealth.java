class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wel=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            max_wel=Math.max(max_wel,sum);
        }
        return max_wel;
    }
}