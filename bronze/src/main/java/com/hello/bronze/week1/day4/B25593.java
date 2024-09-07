package com.hello.bronze.week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class B25593 {
    public static void main(String[] args) throws IOException {
        // 4일차 - 3
        // https://www.acmicpc.net/problem/25593

        // 근무자와, 일한 시간을 key&value 로 받음 hasMap 쓴 이유 -> workTimeMax(), workTimeMin()사용 위해
        Map<String, Integer> memberMap = new HashMap<>();
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주의 개수 N
        int n = Integer.parseInt(br.readLine());
        // 4 교대 근무 -> 4*N
        int totalInputLine = 4 * n;
        // 근무시간 초기값 설정
        int workTime = 0;

        // 근무자를 편성하기 위해 4*N 만큼 근무자를 받음
        for (int i = 1; i <= totalInputLine; i++) {
            // 오전/점심/저녁/야간 근무자를 받아옴
            String[] workers = br.readLine()
                    .split(" ");

            // 근무자 시간 체크
            workTime = switch (i % 4) {
                // 08:00 ~ 12:00 근무자일 시
                case 1 -> 4;
                // 12:00 ~ 18:00 근무자일 시
                case 2 -> 6;
                // 18:00 ~ 22:00 근무자일 시
                case 3 -> 4;
                // 22:00 ~ 08:00 근무자일 시
                default -> 10;
            };

            // 한 주의 근무자를 받아옴
            for (int v = 0; v < workers.length; v++) {
                // 값 통일성
                // 조건 - 알파벳 소문자로 이루어져 있고
                String worker = workers[v].toLowerCase();

                // 근무자가 -일 경우 넘어감
                if (worker.equals("-")) continue;

                // 조건 - 20글자를 넘지 않는다.
                if (worker.length() < 20) return;

                // map memberMap 에 값이 없을 경우
                if (!memberMap.containsKey(worker)) memberMap.put(worker, workTime);
                else memberMap.put(worker, memberMap.get(worker) + workTime);

            }
        }

        // Collection 으로 value의 최소, 최대값을 가져옴
        Integer workTimeMax = Collections.max(memberMap.values());
        Integer workTimeMin = Collections.min(memberMap.values());

        // 조건 근무표가 공평하면 “Yes”를 아니면 “No”를 출력한다.
        // 단, 아무도 근무하지 않을 경우 공평한 것으로 간주한다.
        if (workTimeMax - workTimeMin > 12) System.out.println("NO");
        if (workTimeMax - workTimeMin < 12) System.out.println("YES");
        br.close();
    }
}

