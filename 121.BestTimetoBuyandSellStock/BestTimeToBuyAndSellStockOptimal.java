public class BestTimeToBuyAndSellStockOptimal {

    class Solution {
        public int maxProfit(int[] prices) {

            int maxProfit = 0;
            int minPrice = prices[0];
            // lets track the lowest day we have to avoid nested loops

            for (int i = 0; i < prices.length; i++) {
                if (minPrice > prices[i])
                    minPrice = prices[i];
                else {
                    int profit = prices[i] - minPrice; // evaluate how much profit is made with new minPrice
                    if (profit > maxProfit) // do we have more profit with the new calculation?
                        maxProfit = profit;
                }

            }

            return maxProfit; // return the best profit

        }

    }

}
