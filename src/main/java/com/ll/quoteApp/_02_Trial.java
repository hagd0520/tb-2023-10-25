package com.ll.quoteApp;

import java.util.Scanner;

public class _02_Trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quote;
        String writer;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if (commend.equals("종료")) break;
            else if (commend.equals("등록")) {
                System.out.print("명언 : ");
                quote = sc.nextLine();
                System.out.print("작가 : ");
                writer = sc.nextLine();
            } else System.out.println("잘못된 입력입니다.");
        }
    }
}