package com.ll;

public class _01 {
    public static void main(String[] args) {
        // 피보나치 수열
        long sum = 0;

        int x1 = 1;
        int x2 = 2;

        while ( x2 <= 50000000) {
            System.out.println(x2);

            int temp = x2;
            x2 = x1 + x2;
            x1 = temp;
        }
    }
}
