package pro.dmitrypukhov.javaquiz.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    /**
     * Example 1:
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    @Test
    void maxProfit_example1() {
        int out = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, out);
    }

    /**
     * Example 2:
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     */
    @Test
    void maxProfit_example2() {
        int out = new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, out);
    }

    @Test
    void maxProfit_2143_3(){
        assertEquals(3, new BestTimeToBuyAndSellStock().maxProfit(new int[]{2,1,4,3}));
    }

    @Test
    void maxProfit_5143_3(){
        assertEquals(3, new BestTimeToBuyAndSellStock().maxProfit(new int[]{5,1,4,3}));
    }

}