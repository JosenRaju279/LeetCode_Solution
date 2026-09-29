public class BestTimetoBuyandSellStockwithCooldown {
    public int maxProfit(int[] prices) {
        int hold = -prices[0];
        int sold = 0;
        int cooldown = 0;

        for (int i = 1; i < prices.length; i++) {
            int newhold = Math.max(hold, cooldown - prices[i]);
            int newSold = hold + prices[i];
            int newcooldown = Math.max(cooldown, sold);

            hold = newhold;
            sold = newSold;
            cooldown = newcooldown;
        }
        return Math.max(sold, cooldown);
    }
}
