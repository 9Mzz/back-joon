package com.hello.bronze.week1.day1;

import java.io.IOException;
import java.util.Scanner;

public class B1330 {
    // 1일차 - 1
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int     A  = sc.nextInt();
        int     B  = sc.nextInt();
        sc.close();

        if(A > B) System.out.println(">");
        if(A < B) System.out.println("<");
        if(A == B) System.out.println("==");

    }
}
