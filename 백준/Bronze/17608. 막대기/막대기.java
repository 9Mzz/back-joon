import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int            n  = Integer.parseInt(br.readLine());

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                int stickHeight = Integer.parseInt(br.readLine());
                // 막대기를 입력받는 과정에서 바로 스택을 관리
                // 현재 막대기가 스택의 가장 위 막대기보다 크면, 더 작은 막대기들은 보이지 않으므로 제거하고
                while (!stack.isEmpty() && stack.peek() <= stickHeight) {
                    stack.pop(); // 더 작은 높이는 제거
                }
                // 현재 막대기가 peek 된 막대기보다 작을 경우 push
                stack.push(stickHeight);
            }
            br.close();

            // 스택에 남아 있는 막대기 수
            System.out.println(stack.size());

            // 결과
            // 반복문마다 스택을 관리 -> 시간 복잡도 O(n)
        }
    }