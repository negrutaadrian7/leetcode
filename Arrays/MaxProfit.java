package Arrays;

public class MaxProfit {
    // return the index;

    public int maxProfit2(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    int diff = prices[j] - prices[i];
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
        }
        return max;
    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfit s1 = new MaxProfit();
        int[] myArr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(s1.maxProfit(myArr));
    }
}
