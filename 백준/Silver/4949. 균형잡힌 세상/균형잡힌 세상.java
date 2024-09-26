
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    // 1일차 - 4 (실버4)
    // https://www.acmicpc.net/problem/4949
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            System.out.println(isBalanced(input) ? "yes" : "no");
        }

    }


    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                // (가 없는 상태에서 ) 가 감지될 경우
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
            //
            if (c == '[') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}