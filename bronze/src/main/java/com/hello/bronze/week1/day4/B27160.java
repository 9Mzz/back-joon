package com.hello.bronze.week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B27160 {

    public static void main(String[] args) throws IOException {
        // 4일차 - 4
        // https://www.acmicpc.net/problem/27160

        Map<String, Integer> hgMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int            n  = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] valueSplit = br.readLine()
                    .split(" ");
            String fruit  = valueSplit[0];
            int    fCount = Integer.parseInt(valueSplit[1]);

            // 할리갈리 패에 같은 카드가 없으면
            if(!hgMap.containsKey(fruit)) hgMap.put(fruit, fCount);
            else hgMap.put(fruit, hgMap.get(fruit) + fCount);
        }

        String answer = "NO";

        for(String key : hgMap.keySet())
            if(hgMap.get(key) == 5) answer = "YES";
        
        br.close();
        System.out.println(answer);
    }
}
