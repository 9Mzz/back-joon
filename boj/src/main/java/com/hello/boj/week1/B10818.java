package com.hello.boj.week1;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int     n   = sc.nextInt();
        int     min = Integer.MAX_VALUE;
        int     max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m < min) min = m;
            if (m > max) max = m;
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}
