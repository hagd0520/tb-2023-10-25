package com.ll.practice;

import java.io.*;
import java.util.Scanner;

public class _00_onlyForPractice {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("C:\\Users\\hagd0\\Desktop\\Quote_app\\out.txt");
//        for (int i = 1; i < 11; i++) {
//            String data = i+" 번째 줄입니다.";
//            pw.println(data);
//        }
//        pw.close();
//
//        PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\hagd0\\Desktop\\Quote_app\\out.txt", true));
//        for (int i = 11; i < 21; i++) {
//            String data = i + " 번째 줄입니다.";
//            pw2.println(data);
//        }
//        pw2.close();

//        byte[] b = new byte[1024];
//        FileInputStream input = new FileInputStream("C:\\Users\\hagd0\\Desktop\\Quote_app\\out.txt");
//        input.read(b);
//        System.out.println(new String(b));
//        input.close();

//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hagd0\\Desktop\\Quote_app\\out.txt"));
//        while(true) {
//            String line = br.readLine();
//            if (line==null) break; // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
//            System.out.println(line);
//        }
//        br.close();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hagd0\\Desktop\\Quote_app\\out.txt"));
        String[] s = new String[20];
        while(true) {
            int i = 0;
            s[i] = br.readLine();
            if (s[i]==null) break; // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(s[i]);
            i++;
        }
        br.close();
    }
}