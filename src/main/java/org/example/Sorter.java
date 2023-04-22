package org.example;

public class Sorter {
    static void sort(int[] array) {
        sorted(array, 0, array.length - 1);
    }
    static void sorted(int[] array, int min, int max) {
        if (max <= min) return;
        int center = (min + max) / 2;
        sorted(array, min, center);
        sorted(array, center + 1, max);
        merge(array, min, center, max);
    }
    static void merge(int[] array, int min, int center, int max) {
        if (array[center] <= array[center + 1]) {
            return;
        }
        int[] temp = new int[array.length];
        int i = min;
        int j = center + 1;
        System.arraycopy(array, min, temp, min, max - min + 1);
        for (int k = min; k <= max; k++) {
            if (i > center) {
                array[k] = temp[j++];
            } else if (j > max) {
                array[k] = temp[i++];
            } else if (temp[j] < temp[i]) {
                array[k] = temp[j++];
            } else {
                array[k] = temp[i++];
            }
        }
    }
}
