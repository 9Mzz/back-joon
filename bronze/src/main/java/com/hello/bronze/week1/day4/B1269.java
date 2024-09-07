package com.hello.bronze.week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B1269 {
    public static void main(String[] args) throws IOException {
        // 4일차 - 0
        // https://www.acmicpc.net/problem/1269

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 크기 받기
        String[] split = br.readLine()
                .split(" ");
        int sizeA = Integer.parseInt(split[0]);
        int sizeB = Integer.parseInt(split[1]);


        // A
        // A에 넣을 값 받기
        String[] splitA = br.readLine()
                .split(" ");
        Set<Integer> setA = new HashSet<>();
        for(int i = 0; i < sizeA; i++)
            setA.add(Integer.valueOf(splitA[i]));


        // B
        // B에 넣을 값 받기
        String[] splitB = br.readLine()
                .split(" ");
        Set<Integer> setB = new HashSet<>();
        for(int i = 0; i < sizeB; i++)
            setB.add(Integer.valueOf(splitB[i]));


        // A 비교
        int countA = 0;
        for(Integer i : setA)
            if(!setB.contains(i)) countA++;

        // B 비교
        int countB = 0;
        for(Integer i : setB)
            if(!setA.contains(i)) countA++;

        int result = countA + countB;
        System.out.println(result);

        br.close();
    }
}
