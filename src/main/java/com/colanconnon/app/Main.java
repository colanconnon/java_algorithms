package com.colanconnon.app;

import com.colanconnon.app.DataStructures.BinarySearchTreeSymbolTable;
import com.colanconnon.app.DataStructures.LRUCache;
import com.colanconnon.app.puzzles.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void performMergeSort() {
        // write your code here
        MergeSort mergeSort = new MergeSort();
        int[] intArr = new int[]{5, 4, 9, 0, 3, 1, 12, 4};
        System.out.println(Arrays.toString(mergeSort.Sort(intArr)));
    }


    public static void performMergeSortBU() {
        // write your code here
        MergeSortBU mergeSort = new MergeSortBU();
        int[] intArr = new int[]{5, 4, 9, 0, 3, 1, 12, 4};
        System.out.println(Arrays.toString(mergeSort.sort(intArr)));
    }

    public static void performQuicksort() {
        QuickSort quickSort = new QuickSort();
        int[] intArr = new int[]{5, 4, 9, 5, 0, 3, 1, 5, 5, 5, 12, 4};
        System.out.println(Arrays.toString(quickSort.sort(intArr)));
    }

    public static void perform3WayQuicksort() {
        ThreeWayQuickSort quickSort = new ThreeWayQuickSort();
        int[] intArr = new int[]{5, 4, 9, 5, 0, 3, 1, 5, 5, 5, 12, 4};
        System.out.println(Arrays.toString(quickSort.sort(intArr)));
    }

    public static void performStockBuyAndSale() {
        int price[] = {100, 101, 90, 89, 91, 88,  87};        
        ArrayList<BuySaleInterval> results = StockBuyAndSale.computeMaxiumumProfit(price);
        int profit = 0;
        for (BuySaleInterval interval: results) {
            System.out.println("Buy on day: " + interval.buy + " Sell on day: " + interval.sale);
            profit += price[interval.sale] - price[interval.buy];
        }
        System.out.println("Total Profit: " + profit);
    }

    public static void performLruCache() {
        LRUCache<String, String> lru_cache = new LRUCache<>(3);
        lru_cache.set("hello", "world");
        lru_cache.set("hello1", "world1");
        lru_cache.set("hello2", "world2");
        System.out.println(lru_cache.get("hello"));
        lru_cache.set("hello3", "world3");
        System.out.println(lru_cache.get("hello"));        
        System.out.println(lru_cache.get("hello1"));
        System.out.println(lru_cache.keys());
    }

    public static void main(String[] args) {
        // BinarySearchTreeSymbolTable<Integer,String> table = new BinarySearchTreeSymbolTable<>();
        // table.put(5, "Hello world");
        // table.put(10, "Testing");
        // System.out.println(table.get(5));

        // table.delete(5);
        // System.out.println(table.get(10));
        performStockBuyAndSale();

    }
}
