package com.hello.boj.week1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        // 입력 받을 Scanner
        Scanner sc = new Scanner(System.in);

        Integer[][]           arrayA    = new Integer[5][5];
        Integer[][]           arrayB    = new Integer[5][5];
        Map<Integer, Integer> memberMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int n = sc.nextInt();
                arrayB[i][j] = n;
            }
        }
        int workDifficult;
        int minDifficult = 0;
        int memberNumber = 0;

        // n명의 회원의 난이도를 계산
        for (int i = 0; i < 5; i++) {
            workDifficult = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++)
                    workDifficult = workDifficult + (arrayA[i][k] * arrayB[k][j]);
            }

            memberMap.put(i, workDifficult);
            // 최소
            if (minDifficult == 0) {
                minDifficult = workDifficult;
                continue;
            }

            if (minDifficult > workDifficult) minDifficult = workDifficult;
        }

        for (int i = 4; i > 1; i--) {
            if (memberMap.get(i) == minDifficult) {
                memberNumber = i;
                break;
            }
        }
        String[] memberArray = new String[]{"Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki"};


        System.out.println(memberArray[memberNumber]);
        sc.close();
    }
}
