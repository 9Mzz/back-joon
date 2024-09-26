package com.hello.boj.week1;

import java.io.IOException;
import java.util.Scanner;

public class B2475 {
    public static void main(String[] args) throws IOException {
        // 1 일차 - 2
        // 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6 자리의 고유번호를 매긴다.
        // 고유번호의 처음 5 자리에는 00000 부터 99999 까지의 수 중 하나가 주어지며 6 번째 자리에는 검증수가 들어간다.
        // 검증수는 고유번호의 처음 5 자리에 들어가는 5 개의 숫자를 각각 제곱한 수의 합을 10 으로 나눈 나머지이다.
        // 예를 들어 고유번호의 처음 5 자리의 ㅋ숫자들이 04256 이면, 각 숫자를 제곱한 수들의 합 0 + 16 + 4 + 25 + 36 = 81 을 10 으로 나눈 나머지인 1 이 검증수이다.

        int     result = 0;
        Scanner sc     = new Scanner(System.in);
        String[] strSplit = sc.nextLine()
                .split(" ");
        if (strSplit.length != 5) {
            return;
        }
        for (String value : strSplit) {
            int output = Integer.parseInt(value);
            result += (output * output);
        }
        System.out.println(result % 10);
        sc.close();
    }
}
