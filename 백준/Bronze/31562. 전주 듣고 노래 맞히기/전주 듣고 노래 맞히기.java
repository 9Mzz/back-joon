
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int                       N   = Integer.parseInt(st.nextToken());
        int                       M   = Integer.parseInt(st.nextToken());
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int    T = Integer.parseInt(st.nextToken());    // 노래 제목의 길이 T
            String S = st.nextToken();  // 문자열 노래 제목 S
            if (S.length() != T) {
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                sb.append(st.nextToken());
            }
            String questionToneName = sb.toString();

            map.putIfAbsent(questionToneName, new ArrayList<>());
            map.get(questionToneName).add(S);   // Map Value(List)에 제목을 집어넣음
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                sb.append(st.nextToken());
            }
            String answerToneName = sb.toString();

            List<String> quizResult = map.getOrDefault(answerToneName, new ArrayList<>());
            if (quizResult.size() > 1) {
                System.out.println("?");
            } else if (quizResult.size() == 1) {
                System.out.println(quizResult.get(0));
            } else {
                System.out.println("!");
            }
        }
        br.close();
    }
}