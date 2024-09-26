import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2일차 - 3 (실버 5)
        // https://www.acmicpc.net/problem/1769

        BufferedReader br    = new BufferedReader(new InputStreamReader(System.in));
        String         input = br.readLine();
        int            count = 0;

        while (input.length() > 1) {
            int sum = 0;
            count++;
            for (char c : input.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            input = String.valueOf(sum);
        }
        int result = Integer.parseInt(input);
        System.out.println(count);
        System.out.println(result % 3 == 0 ? "YES" : "NO");
    }
}
