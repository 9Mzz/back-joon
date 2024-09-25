package com.hello.bronze.week1;

import java.util.Scanner;

public class B11945 {
    public static void main(String[] args) {
        // 1일차 - 4
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int x = sc.nextInt();

        for(int i = 0; i < y; i++) {
            StringBuilder sb = new StringBuilder(sc.next());
            System.out.println(sb.reverse());
        }

    }
}
