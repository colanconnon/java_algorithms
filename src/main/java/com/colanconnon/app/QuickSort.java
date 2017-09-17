package com.colanconnon.app;

import java.util.Arrays;

/**
 * Created by colanconnon on 1/28/17.
 */
public class QuickSort {

    public int[] sort(int[] a) {
        a = sort(a, 0, a.length - 1);
        return a;
    }

    private int[] sort(int[] a, int low, int high) {
        if (high <= low) return a;
        int j = partition(a, low, high);
        System.out.println("Array: " + Arrays.toString(a) + " partition: " + a[j]);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
        return a;
    }

    private int partition(int[] array, int low, int high) {
        int i = low, j = high + 1;

        int part = array[low];

        while (true) {
            //move the i element right in the array to make sure it's sorted
            while (array[++i] < part) if (i == high) break;
            //make j to the left of the aray
            while (part < array[--j]) if (j == low) break;
            // if i >= j, then we are done
            if (i >= j) break;
            // swap i and j
            swap(array, i, j);
        }
        swap(array, low, j);
        return j;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;

    }
}
