package com.colanconnon.app;

/**
 * Created by colanconnon on 1/28/17.
 */
public class MergeSortBU {
    private int[] aux;

    public int[] sort(int[] array) {
        int N = array.length;
        aux = new int[N];
        for (int sz = 1; sz < N; sz = sz + sz)
            for (int lo = 0; lo < N - sz; lo += sz + sz)
                merge(array, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
        return array;
    }

    private void merge(int[] array, int low, int mid, int high) {
        int i = low, j = mid + 1;

        for (int k = low; k <= high; k++) aux[k] = array[k];

        for (int k = low; k <= high; k++) {
            if (i > mid) array[k] = aux[j++];
            else if (j > high) array[k] = aux[i++];
            else if (aux[j] < aux[i]) array[k] = aux[j++];
            else array[k] = aux[i++];
        }
    }

}
