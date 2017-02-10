package com.colanconnon;

/**
 * Created by colanconnon on 1/28/17.
 */
public class ThreeWayQuickSort {

    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    public int[] sort(int[] array, int low, int high) {
        if (high <= low) return array;
        int lt = low, gt = high;
        int v = array[low];
        int i = low;
        while (i <= gt) {
            if (array[i] < v) swap(array, lt++, i++);
            else if (array[i] > v) swap(array, i, gt--);
            else i++;
        }

        sort(array, low, lt - 1);
        sort(array, gt + 1, high);
        return array;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
