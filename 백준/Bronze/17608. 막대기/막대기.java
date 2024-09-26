import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2일차 - 1 (브론즈 2)
        // https://www.acmicpc.net/problem/17608
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int            n  = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        //
        for (int i = 0; i < n; i++) {
            Integer stickHeight = Integer.parseInt(br.readLine());
            stack.push(stickHeight);
        }
        br.close();
        // 마지막 막대기를 꺼내본다
        Integer peek   = stack.peek();
        int     result = 1;

        for (int i = 0; i < n; i++) {
            Integer pop = stack.pop();
            if (pop > peek) {
                peek = pop;
                result++;
            }
        }
        System.out.println(result);
    }
}
