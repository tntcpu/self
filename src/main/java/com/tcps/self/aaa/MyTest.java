package com.tcps.self.aaa;

import java.text.NumberFormat;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018-01-13 12:28
 **/
public class MyTest {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        NumberFormat integerInstance=NumberFormat.getIntegerInstance();
        double x = 1;
        System.out.println(currencyInstance.format(x));
        System.out.println(percentInstance.format(x));
        System.out.println(integerInstance.format(x));
    }
}
