package com.hello.bronze.week2.day1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1966 {

    public static void main(String[] args) {
        // 1일차 -0
        // https://www.acmicpc.net/problem/1966
        Scanner sc = new Scanner(System.in);

        // 첫 줄에 테스트케이스의 수가 주어진다
        int testCases = sc.nextInt();

        for(int t = 0; t < testCases; t++) {
            // 각 테스트케이스는 두 줄로 이루어져 있다.
            // 첫 번째 줄에는 문서의 개수 N
            int n = sc.nextInt();
            // 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue 에서 몇 번째에 놓여 있는지를 나타내는 정수 M
            int m = sc.nextInt();

            // 중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.
            Queue<Documents> queue      = new LinkedList<>();
            int[]            priorities = new int[9];
            for(int i = 0; i < n; i++) {
                int priority = sc.nextInt();
                queue.add(new Documents(i, priority));
                priorities[priority - 1]++;
            }
            int printOrder = 0;
            while(!queue.isEmpty()) {
                Documents current           = queue.poll();
                boolean   hasHigherPriority = false;

                for(int i = current.priority; i < 9; i++) {

                    // 중요도 값이 있을 경우(0 이상인 경우)
                    if(priorities[i] > 0) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if(hasHigherPriority) {
                    queue.add(current);
                } else {
                    printOrder++;
                    priorities[current.priority - 1]--;
                    if(current.index == m) {
                        System.out.println(printOrder);
                        break;
                    }
                }

            }
        }

        sc.close();
    }

    static class Documents {
        // 문서의 순서
        int index;
        // 문서의 중요도
        int priority;

        public Documents(int index, int priority) {
            this.index    = index;
            this.priority = priority;
        }
    }


}