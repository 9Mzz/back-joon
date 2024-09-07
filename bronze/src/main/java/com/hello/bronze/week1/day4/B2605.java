package com.hello.bronze.week1.day4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2605 {
    public static void main(String[] args) throws IOException {
        // 4일차 - 1
        // https://www.acmicpc.net/problem/2605
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n 명의 학생 받기
        int n = Integer.parseInt(br.readLine());

        // 순서를 저장할 배열 생성
        ArrayList<Integer> arrays = new ArrayList<>();
        // 0 1 1 3 2 ... 값을 받을 token 5
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            // 줄 순서, 학생
            arrays.add(i - value, i + 1);
        }

        // 값 출력
        for(int i = 0; i < n; i++)
            System.out.print(arrays.get(i) + " ");
        br.close();
    }
}
