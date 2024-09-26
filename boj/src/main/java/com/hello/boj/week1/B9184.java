package com.hello.boj.week1;

import java.util.Scanner;

public class B9184 {

    static int[][][] arrays = new int[21][21][21];

    public static void main(String[] args) {
        // 2일차 - 4
        // 메모리제이션
        // 참고
        // https://wondytyahng.tistory.com/entry/memoization-%EB%A9%94%EB%AA%A8%EC%9D%B4%EC%A0%9C%EC%9D%B4%EC%85%98
        // https://gaybee.tistory.com/45
        Scanner sc = new Scanner(System.in);
        int     a;
        int     b;
        int     c;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == -1 && b == -1 && c == -1) {
                break;

            }
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));

        }
        sc.close();

    }

    static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        // 만약 계산을 한 적이 있다면, 아래 Logic을 거치지 않고 바로 return
        if (arrays[a][b][c] != 0) {
            return arrays[a][b][c];
        }

        // Logic
        if (a < b && b < c) {
            arrays[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            return arrays[a][b][c];
        }
        // 3차원 함수에 값 저장
        arrays[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        return arrays[a][b][c];
    }

}
