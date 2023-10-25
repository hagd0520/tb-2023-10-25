package com.ll.quoteApp;

import java.util.Scanner;

public class _01_Trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if (commend.equals("종료")) break;
            else System.out.println("잘못된 입력입니다.");
        }
    }
}
