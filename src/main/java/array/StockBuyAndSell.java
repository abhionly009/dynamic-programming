package main.java.array;

/**
 * Problem Statement: You are given an array of prices where prices[i]
 * is the price of a given stock on an ith day. You want to maximize
 * your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */
public class StockBuyAndSell {

    /**
     *
     * @param prices: prices = [7,1,5,3,6,4]
     * Output: 5
     * @return
     */
    public int buyAndSell(int [] prices){
        if (prices == null){
            throw new NullPointerException("Input can not be null");
        }

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (Integer price:prices){

            if (price<minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {


        int[] prices = {2, 1, 5, 3, 8, 4};
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int result = stockBuyAndSell.buyAndSell(prices);

        System.out.println(result);

    }

}
