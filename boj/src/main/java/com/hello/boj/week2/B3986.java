package com.hello.boj.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B3986 {
    // 1일차 - 3 (실버4)
    // https://www.acmicpc.net/problem/3986
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 단어의 수 N 입력
        int n = Integer.parseInt(br.readLine());
        // 좋은 단어의 개수를 세기 위한 변수
        int output = 0;

        // n개의 단어를 입력받아 처리
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            // '좋은 단어'인지 확인
            if (isGoodLine(input)) {
                // 좋은 단어이면 카운트 증가
                output++;
            }
        }
        br.close();
        // 좋은 단어의 총 개수 출력
        System.out.print(output);
    }

    private static boolean isGoodLine(String input) {
        // 문자를 저장할 스택 초기화
        Stack<Character> stack = new Stack<>();

        // 입력 문자열의 각 문자를 순회
        for (char c : input.toCharArray()) {
            // 스택이 비어있지 않고, 스택의 맨 위 문자와 현재 문자가 같으면
            if (!stack.isEmpty() && stack.peek() == c) {
                // 같은 문자가 나오면 쌍을 이루고 스택에서 제거
                stack.pop();
            } else {
                // 비어 있거나, 다른 문자가 나오면 스택에 추가
                stack.push(c);
            }
        }

        // 스택이 비어있다면 모든 문자가 쌍을 이루었다는 의미 -> true 리턴
        return stack.isEmpty();
    }
}