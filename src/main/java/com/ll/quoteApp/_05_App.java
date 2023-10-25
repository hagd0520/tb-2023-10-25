package com.ll.quoteApp;

import java.util.Scanner;

public class _05_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quote2 quotes[] = new Quote2[100];
        int quoteNumber = 0;
        int total = 0;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if (commend.equals("종료")) break;
            else if (commend.equals("등록")) {
                Quote2 quote = new Quote2();
                quotes[quoteNumber] = quote;
                System.out.print("명언 : ");
                quotes[quoteNumber].verse = sc.nextLine();
                System.out.print("작가 : ");
                quotes[quoteNumber].writer = sc.nextLine();
                System.out.println(quoteNumber+1 + "번 명언이 등록되었습니다.");
                quoteNumber++; total++;
            } else if (commend.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                for (int i = total-1; i >= 0; i--) {
                    System.out.println((i+1) + " / " + quotes[i].verse
                    + " / " + quotes[i].writer);
                }
            }
            else System.out.println("잘못된 입력입니다.");
        }
    }
}

class Quote2 {
    String verse;
    String writer;
}
