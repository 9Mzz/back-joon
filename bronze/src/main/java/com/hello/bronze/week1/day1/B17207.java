package com.hello.bronze.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17207 {
    public static void main(String[] args) throws IOException {
        // 1일차 - 6
        // https://www.acmicpc.net/problem/17207


        // 예상 일량
        // 40 50 20 70 10 Inseo
        // 80 20 20 20 50 Junsuk
        // 50 20 10 30 60 Jungwoo
        // 90 10 30 20 40 Jinwoo
        // 10 30 60 10 70 Youngki

        // 처리 시간
        // 10 30 20 20 20 Inseo
        // 50 10 10 10 10 Junsuk
        // 30 10 10 10 40 Jungwoo
        // 60 10 10 10 10 Jinwoo
        // 10 20 40 10 10 Youngki

        // x번 사람의 y번째 일의 예상 일량 - ((x번 사람이 예상한 i번째 일의 난이도) * (i번째 사람이 예상한 y번째 일의 처리시간))
        // x 1 / i 1 ~ 5 / y 1 ~ 5
        Integer[][]    workArrayA = new Integer[5][5];
        Integer[][]    workArrayB = new Integer[5][5];
        BufferedReader br         = new BufferedReader(new InputStreamReader(System.in));


        for(int i = 0; i < 5; i++) {
            String   str   = br.readLine();
            String[] split = str.split(" ");
            for(int j = 0; j < 5; j++) {
                int s = Integer.parseInt(split[j]);
                System.out.print(s + " ");
            }
            System.out.println();


        }
        for(int i = 0; i < 5; i++) {
            String str = br.readLine();
            System.out.println("str2 = " + str);
        }


        // 행렬 A


        //


    }


}


