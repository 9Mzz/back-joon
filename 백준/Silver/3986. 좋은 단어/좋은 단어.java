import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int output = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (isGoodLine(input)) {
                output++;
            }
        }
        br.close();
        System.out.print(output);
    }

    private static boolean isGoodLine(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 같은 문자가 나오면 쌍을 이루고 스택에서 제거
            } else {
                stack.push(c); // 다른 문자가 나오면 스택에 추가
            }
        }

        // 스택이 비어있다면 모든 문자가 쌍을 이루었다는 의미
        return stack.isEmpty();
    }
}