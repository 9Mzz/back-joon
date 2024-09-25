package com.hello.bronze.week1;

import java.io.IOException;
import java.util.Scanner;

public class B27160 {
    public static void main(String[] args) throws IOException {
        // 3일차 - 4
        // https://www.acmicpc.net/problem/27160
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        A = Integer.parseInt(new StringBuilder().append(A)
                .reverse()
                .toString());
        B = Integer.parseInt(new StringBuilder().append(B)
                .reverse()
                .toString());

        System.out.print(Math.max(A, B));
        sc.close();
    }
}
