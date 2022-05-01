package com.belhard.lesson10;

public class Quicksort {
    // быстрая сортировка
    static void qsort(int items[]) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(int items[], int left, int right) {
        int i = left;
        int j = right;
        int x = items[(left + right) / 2];
        int y;
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;
            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        }
        while (i <= j);
        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);


    }
}