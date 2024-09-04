package com.hello.bronze;

import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        int x, y, w, h;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();

        int minX = (w - x) > x ? x : w - x;
        int minY = (h - y) > y ? y : h - y;
        int total = (minY > minX) ? minX : minY;
        System.out.println(total);
        sc.close();
    }
}
