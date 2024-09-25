package com.hello.bronze.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1152 {
    public static void main(String[] args) throws IOException {
        // 3일차 - 3
        // https://www.acmicpc.net/problem/1152

        // 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 공백값 제거
        String str = br.readLine()
                .trim();
        

        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());

        br.close();
    }
}
