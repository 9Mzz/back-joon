package com.hello.boj.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B1269 {
    public static void main(String[] args) throws IOException {
        // 4일차 - 0
        // https://www.acmicpc.net/problem/1269
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int countA = 0;
        for (Integer numA : setA) {
            if (!setB.contains(numA)) {
                countA++;
            }
        }

        int countB = 0;
        for (Integer numB : setB) {
            if (!setA.contains(numB)) {
                countB++;
            }
        }
        int totalCount = countA + countB;
        System.out.print(totalCount);


    }
}
