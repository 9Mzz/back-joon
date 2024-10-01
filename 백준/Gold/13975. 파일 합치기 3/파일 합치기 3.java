
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int             T  = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            PriorityQueue<Long> pq = new PriorityQueue<>();
            // 첫 행에는 소설을 구성하는 장의 수를 나타내는 양의 정수 K (3 ≤ K ≤ 1,000,000)가 주어진다.
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                // 파일 크기를 나누고 pq 에 집어넣는다
                pq.offer(Long.valueOf(Integer.parseInt(st.nextToken())));
            }
            long totalNum = 0; // 총 비용 초기화
            while (pq.size() > 1) {
                long firstNum  = pq.poll();
                long secondNum = pq.poll();

                // 파일 합치기
                long addNum = firstNum + secondNum;
                totalNum += addNum;

                pq.offer(addNum);
            }
            bw.write(totalNum + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
