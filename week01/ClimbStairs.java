package com.nokia.javalib;

public class MyClass {
    public static void main(String[] args) {
     System.out.println( "计算结果 "+climbStairs(5));
    }

    private static int climbStairs(int n) {
        int o = 0;
        int p = 0;
        int q = 1;
        for (int i = 0; i < n; i++) {
            o = p;
            p = q;
            q = o + p;
        }
        return q;
    }
}
