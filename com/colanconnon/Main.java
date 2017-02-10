package com.colanconnon;

import com.colanconnon.DataStructures.BinarySearchTreeSymbolTable;

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

    public static void main(String[] args) {
        BinarySearchTreeSymbolTable<Integer,String> table = new BinarySearchTreeSymbolTable<>();
        table.put(5, "Hello world");
        table.put(10, "Testing");
        System.out.println(table.get(5));

        table.delete(5);
        System.out.print(table.get(5));


    }
}
