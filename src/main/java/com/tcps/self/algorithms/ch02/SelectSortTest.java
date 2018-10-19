package com.tcps.self.algorithms.ch02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/02/07 10:17
 **/
public class SelectSortTest {
    public static void main(String[] args) {
        Integer[] b = {3, 2, 1};
        System.out.println(Arrays.toString(b));
        selectSort(b);
        System.out.println(Arrays.toString(b));
        String[] a = {"3", "2", "1", "5", "4", "9", "6", "7", "3"};
        System.out.println(Arrays.toString(a));
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectSort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
}
