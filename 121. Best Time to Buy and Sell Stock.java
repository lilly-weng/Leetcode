class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int sum = 0; //紀錄當前收益
        int lowest = prices[0]; //紀錄最低價格，先從第一個股價開始
        for (int i = 1; i < prices.length ; i++) { //從第二天的股價開始遍歷
            if (prices[i] > lowest) {
                sum = Math.max(sum, prices[i]-lowest);
                 //如果股價高於最低股價，我們要考慮收益的情況
            } else { //else的話更新最低股價
                lowest = prices[i];
            }
        }
        return sum;
    }
}
