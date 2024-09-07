package com.hello.bronze.week1.day2;

import java.util.Scanner;

public class B25501 {
    // 2일차 - 2
    //     정휘는 후배들이 재귀 함수를 잘 다루는 재귀의 귀재인지 알아보기 위해 재귀 함수와 관련된 문제를 출제하기로 했다.
    //
    //     팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다.
    //     팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고, 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.
    //
    //     어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다.
    //     아래 코드의 isPalindrome 함수는 주어진 문자열이 팰린드롬이면 1, 팰린드롬이 아니면 0을 반환하는 함수다.
    static int           count;
    static StringBuilder sb;

    public static void main(String[] args) {
        // 초기 세팅
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            // count 값 초기화
            count = 0;
            // result -> 팰린드롬일 경우 1, 아닐 경우 0
            int result = isPalindrome(sc.next());
            sb.append(result + " " + count + "\n");
        }
        sc.close();
        // 결과값 출력
        System.out.println(sb.toString());
    }

    public static int isPalindrome(String s) {
        // 재귀함수 위해 method 분리
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        count++;
        // 팰린드롬 수치를 벗어날 경우
        if(r <= l) return 1;
        // AxxxxB 인 경우(팰린드롬이 아닐 경우)
        if(s.charAt(l) != s.charAt(r)) return 0;
        // AxxxxA인 경우(팰린드롬인 경우)
        return recursion(s, l + 1, r - 1);
    }
}