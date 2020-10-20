package com.nokia.javalib;

public class MyClass {
    public static void main(String[] args) {
     
    }

    /**
     * leetCode 66 加一
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int last = digits.length-1;
        digits[last]++;
        if(digits[last] != 10){
            return digits;
        }
        for(int i= last; i>=0;i--){
            if(digits[i] == 10){
                digits[i] = 0;
                if(i==0){
                    digits = new int[digits.length+1];
                    digits[0] = 1;
                }else
                    digits[i-1]++;
            }
        }
        return digits;
    }
}
