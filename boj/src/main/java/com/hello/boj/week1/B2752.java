package com.hello.boj.week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2752 {
    public static void main(String[] args) throws IOException {
        // 3일차 - 0
        // https://www.acmicpc.net/problem/2752
        // 동규는 세수를 하다가 정렬이 하고 싶어졌다.
        //
        // 정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.
        //
        // 정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrays = new int[3];
        for (int i = 0; i < arrays.length; i++)
            arrays[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrays);
        System.out.println(arrays[0] + " " + arrays[1] + " " + arrays[2]);
    }
}
