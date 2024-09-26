import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2일차 - 2 (브론즈 2)
        // https://www.acmicpc.net/problem/12605

        // BufferedReader를 사용하여 입력을 효율적으로 처리
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int             n  = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 총 케이스 수 N을 읽어옴
        for (int i = 0; i < n; i++) {
            // 단어를 저장할 스택 생성
            Stack<String> stack = new Stack<>();

            // 입력된 한 줄을 공백을 기준으로 분리
            st = new StringTokenizer(br.readLine());
            // 단어 수 count
            int tokens = st.countTokens();

            // 단어별로 스택에 push
            for (int j = 0; j < tokens; j++) {
                stack.push(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();
            // 스택에서 단어를 pop 하여 반전된 순서로 결과 문자열 생성
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
                if (!stack.isEmpty()) {
                    sb.append(" ");
                }
            }
            // 결과 출력: "Case #n: " 형식으로 출력
            System.out.println("Case #" + (i + 1) + ": " + sb.toString());
        }
        br.close();

    }
}
