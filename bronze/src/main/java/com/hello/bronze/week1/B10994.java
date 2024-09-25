package com.hello.bronze.week1;

import java.util.Scanner;

public class B10994 {
    // 2일차 - 3
    static char[][] arrays;

    public static void main(String[] args) {
        // 사전 준비 + 값 받기
        Scanner sc = new Scanner(System.in);
        int     n  = sc.nextInt();
        sc.close();
        // n = 1 / 1 * 1
        // n = 2 / 5 * 5
        // n = 3 / 9 * 9
        // n = 4 / 13 * 13
        // n이 1씩 올라갈 때 마다 (4n-3)의 배열이 생성되는 걸 알 수 있다.
        int func = 4 * n - 3;
        arrays = new char[func][func];
        for(int i = 0; i < func; i++) {
            for(int j = 0; j < func; j++) {
                arrays[i][j] = 'a';
            }
        }

        // 재귀 method drawStar
        drawStar(0, func);

        // 값 출력
        for(int i = 0; i < func; i++) {
            for(int j = 0; j < func; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }

    private static void drawStar(int a, int func) {
        if(func <= a) return;
        for(int i = a; i < func; i++) {
            // 맨 윗줄 그리기
            arrays[a][i] = '*';
            // 맨 밑줄 그리기
            arrays[func - 1][i] = '*';
            // 왼쪽 줄 그리기
            arrays[i][a] = '*';
            // 오른쪽 줄 그리기
            arrays[i][func - 1] = '*';
        }
        drawStar(a + 2, func - 2);
    }
}