package com.colanconnon.app.puzzles;

import java.util.ArrayList;


public class StockBuyAndSale {

    public static ArrayList<BuySaleInterval> computeMaxiumumProfit(int[] price) {
        int number_of_prices = price.length;

        if (number_of_prices < 2) {
            throw new Error("Must have atleast two prices");
        }

        ArrayList<BuySaleInterval> results = new ArrayList<>();
        int i = 0;
        while (i < number_of_prices - 1) {
            while ((i < number_of_prices - 1) && (price[i + 1] <= price[i])) {
                i++;
            }
            if (i == number_of_prices - 1) {
                break;
            }

            BuySaleInterval interval = new BuySaleInterval();
            interval.buy = i++;

            while ((i < number_of_prices && (price[i] >= price[i - 1]))) {
                i++;
            }

            interval.sale = i-1;
            results.add(interval);
        }
        return results;
    }
}