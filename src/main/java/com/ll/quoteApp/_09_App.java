package com.ll.quoteApp;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _09_App {
    public void run() throws IOException {
        Scanner sc = new Scanner(System.in); // scanner
        Quote6 quotes[] = new Quote6[100]; // Array for saving info
        int quoteNumber = 0;
        int total = 0;
        int count = 0;

        ArrayList<String> array = new ArrayList<>(); // 저장과 불러오기를 위한 ArrayList

        // 불러오기
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hagd0\\Desktop\\Quote_app\\Quote.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            array.add(line);
        }
        // 불러온 파일 입력하기
        try {
            quoteNumber = Integer.parseInt(array.get(0));
            total = Integer.parseInt(array.get(1));
            int s = 2;
            count = total;
            while (count > 0) {
                quotes[Integer.parseInt(array.get(s))] = new Quote6();
                quotes[Integer.parseInt(array.get(s))].verse = array.get(s + 1);
                quotes[Integer.parseInt(array.get(s))].writer = array.get(s + 2);
                count--;
            }
        } catch (Exception e) {}
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String commend = sc.nextLine();
            if (commend.equals("종료")) {
                // 저장을 위한 PrintWriter
                PrintWriter pw = new PrintWriter("C:\\Users\\hagd0\\Desktop\\Quote_app\\Quote.txt");
                count = total;
                pw.println(quoteNumber+"\n"+total);
                while (count > 0) {
                    for (int i = 0; i < quoteNumber; i++) {
                        if (quotes[i].verse != null) {
                            String data = i + "\n" + quotes[i].verse + "\n" + quotes[i].writer;
                            pw.println(data);
                            count--;
                        } else {
                            String data = i + "\n" + quotes[i].verse + "\n" + quotes[i].writer;
                            pw.println(data);
                        }
                    }

                }
                pw.close();
                break;
            }
            // 등록
            else if (commend.equals("등록")) {
                quotes[quoteNumber] = new Quote6();
                System.out.print("명언 : ");
                quotes[quoteNumber].verse = sc.nextLine();
                System.out.print("작가 : ");
                quotes[quoteNumber].writer = sc.nextLine();
                System.out.println(quoteNumber+1 + "번 명언이 등록되었습니다.");
                quoteNumber++; total++;
            }
            // 삭제 (Request 클래스를 활용하면 편하다고 하니까 나중에 활용해봐야지)
            else if (commend.startsWith("삭제?id=")) {
                int i = Integer.parseInt(commend.substring(6).trim());
                try {
                    if (quotes[i - 1].verse != null) {
                        try {
                            quotes[i - 1] = new Quote6();
                            System.out.println(i + "번 명언이 삭제되었습니다.");
                            total--;
                        } catch (Exception e) {
                            System.out.println("잘못된 입력입니다.");
                        }
                    } else System.out.println(i + "번 명언은 존재하지 않습니다.");
                } catch (Exception e) {
                    System.out.println(i + "번 명언은 존재하지 않습니다.");
                }
            }
            // 수정
            else if (commend.startsWith("수정?id=")) {
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
            }
            // 목록
            else if (commend.equals("목록")) {
                count = total;
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
            }
            // 초기화
            else if (commend.equals("초기화")) {
                System.out.print("모든 명언이 초기화됩니다. 실행하시겠습니까? (Y/N)) ");
                commend = sc.nextLine();
                if (commend.equals("Y")) {
                    quotes = new Quote6[100];
                    quoteNumber = 0;
                    total = 0;
                } else if (commend.equals("N")) System.out.println("초기화가 취소되었습니다.");
            }
            // 명령 입력에 예외 발생 시
            else System.out.println("잘못된 입력입니다.");
        }
    }
}

class Quote6 {
    String verse;
    String writer;
}