
import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine());
        int                 N       = Integer.parseInt(st.nextToken()); // 거인의 수
        Long                HC      = Long.valueOf(st.nextToken()); // 센티의 키
        int                 T       = Integer.parseInt(st.nextToken());// 뿅망치 사용 횟수
        int                 count   = 0;
        PriorityQueue<Long> village = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Long H = Long.valueOf(st.nextToken());   // 거인의 키
            village.offer(H);       // 거인 등록
        }

        for (int j = 0; j < T; j++) {
            // 거인 데려오기
            Long giant = village.poll();
            if (giant == null) {
                break;
            }

            // 만약 센티가 거인보다 클 경우
            if (HC > giant) {
                village.offer(giant);
                break;
            } else {
                long foldGiant = 0L;
                if (giant == 1L) {
                    foldGiant = 1L;
                } else {
                    foldGiant = giant / 2;
                }

                village.offer(foldGiant);
                count++;
            }
        }

        // 거인이 hc보다 작아지면
        if (village.peek() == null || village.peek() < HC) {
            System.out.println("YES");
            System.out.println(count);
            // bw.write("YES\n");
            // bw.write(count);
        } else {
            System.out.println("NO");
            System.out.println(village.peek());
            // bw.write("NO\n");
            // bw.write(String.valueOf(village.peek()));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
