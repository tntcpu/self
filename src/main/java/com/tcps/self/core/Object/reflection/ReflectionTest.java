package com.tcps.self.core.Object.reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/25 14:42
 **/
public class ReflectionTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 5);
        System.out.println(Arrays.toString(a));

        String b = "hah";
        goodCopyOf(b,8);
    }

    public static Object goodCopyOf(Object a, int newArrayLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) {
            return null;
        }
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newArrayLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newArrayLength));
        return newArray;
    }
}
