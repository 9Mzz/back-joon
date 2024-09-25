package com.hello.bronze.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class B10866 {
    // 1일차 - 2 (실버4)
    // https://www.acmicpc.net/problem/10866
    public static void main(String[] args) throws IOException {
        // BufferedReader 를 사용하여 입력을 빠르게 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ArrayDeque를 사용하여 덱 구현
        Deque<Integer> deque = new ArrayDeque<>();

        // 명령의 수 N을 입력받음
        int N = Integer.parseInt(br.readLine());
        // 출력 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            // input 입력받음
            String input = br.readLine();
            // input과 인자를 분리
            String[] parts = input.split(" ");
            // input에 따라 처리
            switch (parts[0]) {
                case "push_front":
                    // 덱의 앞에 정수 X를 추가
                    deque.addFirst(Integer.parseInt(parts[1]));
                    break;
                case "push_back":
                    // 덱의 뒤에 정수 X를 추가
                    deque.addLast(Integer.parseInt(parts[1]));
                    break;
                case "pop_front":
                    // 덱의 앞에서 요소를 제거 후 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst())
                            .append("\n");
                    break;
                case "pop_back":
                    // 덱의 뒤에서 요소를 제거하고 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast())
                            .append("\n");
                    break;
                case "size":
                    // 덱의 크기를 출력
                    sb.append(deque.size())
                            .append("\n");
                    break;
                case "empty":
                    // 덱이 비어있으면 1, 아니면 0을 출력
                    sb.append(deque.isEmpty() ? 1 : 0)
                            .append("\n");
                    break;
                case "front":
                    // 덱의 가장 앞 요소를 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst())
                            .append("\n");
                    break;
                case "back":
                    // 덱의 가장 뒤 요소를 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast())
                            .append("\n");
                    break;
            }
        }
        // 최종 결과 출력
        System.out.print(sb);
    }
}