package com.hello.bronze.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2605 {
    public static void main(String[] args) throws IOException {
        // 3일차 - 1
        // https://www.acmicpc.net/problem/2605

        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n 명의 학생 받기
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrays = new ArrayList<>();
        StringTokenizer    st     = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            // 순서 , 학생
            arrays.add(i - value, i + 1);
            System.out.println(arrays.toString());
        }
        br.close();
    }
}
