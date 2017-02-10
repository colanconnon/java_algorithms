package com.colanconnon;

import java.util.Arrays;

/**
 * Created by colanconnon on 1/27/17.
 */
public class MergeSort {
    int[] aux;

    public int[] Sort(int[] array) {
        aux = new int[array.length];
        this.sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        System.out.println("Mid: " + mid + "  low: " + low + " High: " + high);
        System.out.println(Arrays.toString(array));
        merge(array, low, mid, high);

    }

    private void merge(int[] array, int low, int mid, int high) {
        int i = low, j = mid + 1;

        for (int k = low; k <= high; k++) {
            aux[k] = array[k];
        }

        for (int k = low; k <= high; k++) {
            //if i is greater than the mid then we have already gotten all the lower bound elms
            if (i > mid) array[k] = aux[j++];
                //if j > high then we have already got all the higher bound elements
            else if (j > high) array[k] = aux[i++];
                // if aux[j] < aux[i] then array[k] is aux[j++]
            else if (aux[j] < aux[i]) array[k] = aux[j++];
            else array[k] = aux[i++];
        }
    }

}
