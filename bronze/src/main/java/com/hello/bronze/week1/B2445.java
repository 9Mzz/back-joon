package com.hello.bronze.week1;

import java.util.Scanner;

public class B2445 {
    public static void main(String[] args) {
        // 1일차 - 3
        // 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
        // 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
        // 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

        Scanner sc    = new Scanner(System.in);
        int     input = sc.nextInt();

        for(int a = 1; a <= input; a++) {
            for(int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            for(int k = 1; k <= 2 * input - 2 * a; k++) {
                System.out.print(" ");
            }
            for(int l = 1; l <= a; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int b = input - 1; b >= 1; b--) {
            for(int x = 1; x <= b; x++) {
                System.out.print("*");
            }
            for(int y = 1; y <= 2 * input - 2 * b; y++) {
                System.out.print(" ");
            }
            for(int z = 1; z <= b; z++) {
                System.out.print("*");
            }
            if(b != 1) {
                System.out.println();
            }
        }

    }
}