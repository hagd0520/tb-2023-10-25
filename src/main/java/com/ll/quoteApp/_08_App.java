package com.ll.quoteApp;

import java.util.Scanner;

public class _08_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quote5 quotes[] = new Quote5[100];
        int quoteNumber = 0;
        int total = 0;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if (commend.equals("종료")) break;
            else if (commend.equals("등록")) {
                Quote5 quote = new Quote5();
                quotes[quoteNumber] = quote;
                System.out.print("명언 : ");
                quotes[quoteNumber].verse = sc.nextLine();
                System.out.print("작가 : ");
                quotes[quoteNumber].writer = sc.nextLine();
                System.out.println(quoteNumber+1 + "번 명언이 등록되었습니다.");
                quoteNumber++; total++;
            } else if (commend.startsWith("삭제?id=")) {
                int i = Integer.parseInt(commend.substring(6).trim());
                try {
                    if (quotes[i - 1].verse != null) {
                        try {
                            quotes[i - 1] = new Quote5();
                            System.out.println(i + "번 명언이 삭제되었습니다.");
                            total--;
                        } catch (Exception e) {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else System.out.println(i + "번 명언은 존재하지 않습니다.");
                } catch (Exception e) {
                    System.out.println(i + "번 명언은 존재하지 않습니다.");
                }
            } else if (commend.startsWith("수정?id=")) {
                int i = Integer.parseInt(commend.substring(6).trim());
                try {
                    if (quotes[i - 1].verse != null) {
                        try {
                            System.out.println("명언(기존) : " + quotes[i - 1].verse);
                            System.out.print("명언 : ");
                            quotes[i - 1].verse = sc.nextLine();
                            System.out.println("작가(기존) : " + quotes[i - 1].writer);
                            System.out.print("작가 : ");
                            quotes[i - 1].writer = sc.nextLine();
                        } catch (Exception e) {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else System.out.println(i + "번 명언은 존재하지 않습니다.");
                } catch (Exception e) {
                    System.out.println(i + "번 명언은 존재하지 않습니다.");
                }
            } else if (commend.equals("목록")) {
                int count = total;
                System.out.println("번호 / 작가 / 명언");
                while (count > 0) {
                    for (int i = quoteNumber - 1; i >= 0; i--) {
                        if (quotes[i].verse != null) {
                            System.out.println((i + 1) + " / " + quotes[i].verse
                                    + " / " + quotes[i].writer);
                            count--;
                        }
                    }
                }
            } else System.out.println("잘못된 입력입니다.");
        }
    }
}

class Quote5 {
    String verse;
    String writer;
}

