package com.tcps.self.algorithms.ch01;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/02/02 9:03
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] b = {1, 2, 5, 7, 9, 11, 13, 15, 17};
        System.out.println(rank(15, b));
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
