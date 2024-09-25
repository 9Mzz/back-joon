package com.hello.boj.week2;

import java.util.Scanner;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) {
        // 2일차 - 0
        // https://www.acmicpc.net/problem/9012

        Scanner sc = new Scanner(System.in);
        int     n  = sc.nextInt(); // 테스트 케이스의 수


        for (int i = 0; i < n; i++) {
            String next = sc.next();
            System.out.println(parenthesisVerification(next) ? "YES" : "NO");
        }
        sc.close();

    }

    public static boolean parenthesisVerification(String next) {
        Stack<Character> stack = new Stack<>();

        for (char c : next.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }


        }
        return stack.isEmpty();
    }
}