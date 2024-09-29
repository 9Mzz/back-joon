

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader         br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter         bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int query = Integer.parseInt(br.readLine());
        for (int i = 0; i < query; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int             a  = Integer.parseInt(st.nextToken());
            if (a == 0) {
                if (pq.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(pq.poll() + "\n");
                }
            } else {
                for (int j = 0; j < a; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}