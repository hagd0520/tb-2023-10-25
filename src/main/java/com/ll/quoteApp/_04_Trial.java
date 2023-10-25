package com.ll.quoteApp;

import java.util.Scanner;

public class _04_Trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quote1 quotes[] = new Quote1[100];
        int quoteNumber = 0;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if (commend.equals("종료")) break;
            else if (commend.equals("등록")) {
                Quote1 quote = new Quote1();
                quotes[quoteNumber] = quote;
                System.out.print("명언 : ");
                quotes[quoteNumber].verse = sc.nextLine();
                System.out.print("작가 : ");
                quotes[quoteNumber].writer = sc.nextLine();
                System.out.println(quoteNumber+1 + "번 명언이 등록되었습니다.");
                quoteNumber++;
            } else System.out.println("잘못된 입력입니다.");
        }
    }
}

class Quote1 {
    String verse;
    String writer;
}
