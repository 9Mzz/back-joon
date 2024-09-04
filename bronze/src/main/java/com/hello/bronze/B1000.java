package com.hello.bronze;

import java.util.Scanner;

public class B1000 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println(x - y);
        sc.close();
    }
}
