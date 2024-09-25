package com.hello.boj.week1;

import java.util.Scanner;

public class B10872 {
    public static void main(String[] args) {
        //        0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
        //        첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt ();
        //조건 : 정수 N은 0 ≤ N ≤ 12
        if (!(0 <= n) || !(n <= 12)) {
            return;
        }

        System.out.println (factorial (n));
        sc.close ();
    }

     static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial (n - 1);
    }
}
