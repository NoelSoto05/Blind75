public class BestTimeToBuyAndSellStockNAIVE {

    class Solution {
        public int maxProfit(int[] prices) {

            int maxProfit = 0;

            for (int i = 0; i < prices.length; i++) {

                for (int k = i + 1; k < prices.length; k++) {

                    if (prices[i] < prices[k]) {

                        int buyDay = prices[i], sellDay = prices[k];
                        int value = sellDay - buyDay;

                        if (maxProfit < value) {

                            maxProfit = value;
                        }
                    }
                }
            }

            return maxProfit;

        }

    }
}
