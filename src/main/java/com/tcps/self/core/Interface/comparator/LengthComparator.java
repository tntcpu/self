package com.tcps.self.core.Interface.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/27 11,:47
 **/
public class LengthComparator implements Comparator<String> {
    public static void main(String[] args) {
        String[] frends = {"zzt","b","ab","bc","a","c","xoadf"};
        Arrays.sort(frends);
        System.out.println(Arrays.toString(frends));
        Comparator comparator = new LengthComparator();
        Arrays.sort(frends,comparator);
        System.out.println(Arrays.toString(frends));
    }
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
