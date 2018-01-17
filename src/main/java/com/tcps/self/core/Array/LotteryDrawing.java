package com.tcps.self.core.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 * @project self
 * @create 2018-01-09 19:41
 **/
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("抽几个？");
        int k = in.nextInt();

        System.out.println("最大数？");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int r = (int) (Math.random() * (n - 1));
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
