import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        // 사전 작업 -> 소문자로 이루어진 문자열을 숫자로 변환
        // 이후 map에 put
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= 25; i++) {
            char ch = (char) (i + 97);
            map.put(ch, i + 1);
        }
        // 값을 출력할 result 설정
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int            L  = Integer.parseInt(br.readLine());
        if (L < 0 || L > 51) {
            System.exit(0);
        }
        Array[]  arrays = new Array[L];
        String[] split  = br.readLine().trim().split("");
        for (int i = 0; i < split.length; i++) {
            Integer value = map.get(split[i].charAt(0));
            int     total = (int) (value * (Math.pow(31, i)));
            result = result + total;
        }
        System.out.println(result);
    }
}