package com.ll;

public class sub {
    public static void main(String[] args) {
        int number = 10;
        int primeNumber = 0;
        for (int i = 2; i <= number; i++) {
            if (number == i) {
                System.out.println(number + " 는 소수가 맞습니다.");
                primeNumber = i;
            } else if (number % i == 0) {
                System.out.println(number + " 는 소수가 아닙니다.");
                break;
            }
        }
        System.out.println(primeNumber);
    }
}
