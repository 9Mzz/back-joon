package com.hello.bronze.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2477 {
    public static void main(String[] args) throws IOException {
        // 1일차 - 5
        // https://www.acmicpc.net/problem/2477
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int[] directions = new int[6];
        int[] lengths    = new int[6];

        StringTokenizer st;
        for(int i = 0; i < 6; i++) {
            st            = new StringTokenizer(br.readLine(), " ");
            directions[i] = Integer.parseInt(st.nextToken());
            lengths[i]    = Integer.parseInt(st.nextToken());
        }

        int maxWidth  = 0;
        int maxHeight = 0;
        int minWidth  = 0;
        int minHeight = 0;

        for(int i = 0; i < 6; i++) {
            if(directions[i] == 1 || directions[i] == 2) {
                if(maxWidth < lengths[i]) {
                    maxWidth = lengths[i];
                }
            } else
                if(directions[i] == 3 || directions[i] == 4) {
                    if(maxHeight < lengths[i]) {
                        maxHeight = lengths[i];
                    }
                }
        }

        for(int i = 0; i < 6; i++) {
            if((directions[i] == 1 || directions[i] == 2) && lengths[i] == maxWidth) {
                minHeight = Math.abs(lengths[(i + 5) % 6] - lengths[(i + 1) % 6]);
            } else
                if((directions[i] == 3 || directions[i] == 4) && lengths[i] == maxHeight) {
                    minWidth = Math.abs(lengths[(i + 5) % 6] - lengths[(i + 1) % 6]);
                }

        }


        int result = ((maxWidth * maxHeight) - (minWidth * minHeight)) * K;

        System.out.println(result);
    }
}