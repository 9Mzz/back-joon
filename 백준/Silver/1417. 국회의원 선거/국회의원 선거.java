import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int     n  = sc.nextInt();
        // 다솜이의 표 받기
        int dasomVote = sc.nextInt();
        // 매수자 카운트
        int buyer = 0;
        // 내림차순 heap 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 1; i < n; i++) {
            // 다솜이를 제외한 다른 국회의원 표 집어넣기
            pq.offer(sc.nextInt());
        }

        // 가장 득표수가 높은 표보다 클 때 까지 반복
        while (!pq.isEmpty() && dasomVote <= pq.peek()) {
            int poll = pq.poll();
            dasomVote++;
            buyer++;
            poll--;
            if (poll > 0) {
                pq.offer(poll);
            }
        }
        System.out.println(buyer);
    }
}