//package com.ll.quoteApp;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class _10_1_App {
//    public static void main(String[] args) throws IOException {
//        // 목표 : ArrayList 를 사용하여 데이터를 저장하기
//        //       .size 를 사용하여 순서 정의하기
//        List<Quote7> quotesArray = new ArrayList<>();
//        Scanner sc = new Scanner(System.in); // scanner
////        Quote7 quotes[] = new Quote7[100]; // Array for saving info
//        int quoteNumber = 0;
//
//        ArrayList<String> array = new ArrayList<>(); // 저장과 불러오기를 위한 ArrayList
//
//        // 불러오기
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hagd0\\Desktop\\Quote_app\\Quote.txt"));
//        while (true) {
//            String line = br.readLine();
//            if (line == null) break;
//            array.add(line);
//        }
//
//        // 불러온 파일 입력하기
//        int count = quotesArray.size();
//        while (count > 0) {
//            Quote7 quote = new Quote7();
//            quote.verse = array.get(s+1);
//            quote.writer = array.get(s+2);
//            count--;
//        }
//
//        System.out.println("== 명언 앱 ==");
//        while (true) {
//            System.out.print("명령) ");
//            String commend = sc.nextLine();
//            if (commend.equals("종료")) {
//                // 저장을 위한 PrintWriter
//                PrintWriter pw = new PrintWriter("C:\\Users\\hagd0\\Desktop\\Quote_app\\Quote.txt");
//                count = quotesArray.size();
//                pw.println(quoteNumber+"\n"+quotesArray.size());
//                while (count > 0) {
//                    for (int i = 0; i < quoteNumber; i++) {
//                        if (quotesArray.get(i).verse != null) {
//                            String data = i + "\n" + quotesArray.get(i).verse + "\n" + quotesArray.get(i).writer;
//                            pw.println(data);
//                            count--;
//                        } else {
//                            String data = i + "\n" + quotesArray.get(i).verse + "\n" + quotesArray.get(i).writer;
//                            pw.println(data);
//                        }
//                    }
//
//                }
//                pw.close();
//                break;
//            }
//            // 등록
//            else if (commend.equals("등록")) {
//                Quote7 quote = new Quote7();
//                System.out.print("명언 : ");
//                quote.verse = sc.nextLine();
//                System.out.print("작가 : ");
//                quote.writer = sc.nextLine();
//                quotesArray.add(quote);
//                System.out.println(quoteNumber+1 + "번 명언이 등록되었습니다.");
//                quoteNumber++;
//            }
//            // 삭제 (Request 클래스를 활용하면 편하다고 하니까 나중에 활용해봐야지)
//            else if (commend.startsWith("삭제?id=")) {
//                int i = Integer.parseInt(commend.substring(6).trim());
//                try {
//                    if (quotesArray.get(i - 1).verse != null) {
//                        try {
//                            quotesArray.remove(i -1);
//                            System.out.println(i + "번 명언이 삭제되었습니다.");
//                        } catch (Exception e) {
//                            System.out.println("잘못된 입력입니다.");
//                        }
//                    } else System.out.println(i + "번 명언은 존재하지 않습니다.");
//                } catch (Exception e) {
//                    System.out.println(i + "번 명언은 존재하지 않습니다.");
//                }
//            }
//            // 수정
//            else if (commend.startsWith("수정?id=")) {
//                int i = Integer.parseInt(commend.substring(6).trim());
//                try {
//                    if (quotesArray.get(i - 1).verse != null) {
//                        try {
//                            System.out.println("명언(기존) : " + quotesArray.get(i - 1).verse);
//                            System.out.print("명언 : ");
//                            quotesArray.get(i - 1).verse = sc.nextLine();
//                            System.out.println("작가(기존) : " + quotesArray.get(i - 1).writer);
//                            System.out.print("작가 : ");
//                            quotesArray.get(i - 1).writer = sc.nextLine();
//                        } catch (Exception e) {
//                            System.out.println("잘못된 입력입니다.");
//                        }
//                    } else System.out.println(i + "번 명언은 존재하지 않습니다.");
//                } catch (Exception e) {
//                    System.out.println(i + "번 명언은 존재하지 않습니다.");
//                }
//            }
//            // 목록
//            else if (commend.equals("목록")) {
//                count = quotesArray.size();
//                System.out.println("번호 / 작가 / 명언");
//                while (count > 0) {
//                    for (int i = quoteNumber - 1; i >= 0; i--) {
//                        if (quotesArray.get(i).verse != null) {
//                            System.out.println((i + 1) + " / " + quotesArray.get(i).verse
//                                    + " / " + quotesArray.get(i).writer);
//                            count--;
//                        }
//                    }
//                }
//            }
//            // 초기화
//            else if (commend.equals("초기화")) {
//                System.out.print("모든 명언이 초기화됩니다. 실행하시겠습니까? (Y/N)) ");
//                commend = sc.nextLine();
//                if (commend.equals("Y")) {
//                    quotesArray = new ArrayList<>();
//                    quoteNumber = 0;
//                } else if (commend.equals("N")) System.out.println("초기화가 취소되었습니다.");
//            }
//            // 명령 입력에 예외 발생 시
//            else System.out.println("잘못된 입력입니다.");
//        }
//    }
//}
//
//class Quote7 {
//    String verse;
//    String writer;
//}