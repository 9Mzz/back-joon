package com.hello.bronze.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class B27497 {

    // 1일차 - 1 (실버2)
    // https://www.acmicpc.net/problem/27497

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int              n     = Integer.parseInt(br.readLine());
        Deque<Character> deque = new ArrayDeque<>();
        Stack<Boolean>   stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char   num   = input.charAt(0);

            switch (num) {
                case '1':
                    deque.offerLast(input.charAt(2));
                    stack.push(true);
                    break;
                case '2':
                    deque.offerFirst(input.charAt(2));
                    stack.push(false);
                    break;
                case '3':
                    if (!deque.isEmpty()) {
                        if (stack.pop()) {
                            deque.removeLast();
                        } else {
                            deque.removeFirst();
                        }
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : deque) {
            sb.append(c);
        }
        System.out.println(sb.length() > 0 ? sb.toString() : 0);

    }
}