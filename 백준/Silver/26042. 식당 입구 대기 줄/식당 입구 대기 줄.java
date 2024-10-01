import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        LinkedList<Integer> lineQueue = new LinkedList<>();
        int maxCount = 0; // 최대 대기 중인 학생 수
        int bestStudent = Integer.MAX_VALUE; // 최대 대기 중일 때의 맨 뒤 학생 번호

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int student = Integer.parseInt(st.nextToken());
                lineQueue.addLast(student);
            } else {
                lineQueue.removeFirst();
            }

            // 현재 대기 중인 학생 수
            int currentCount = lineQueue.size();
            // 최대 대기 중인 학생 수 갱신
            if (currentCount > maxCount) {
                maxCount = currentCount;
                bestStudent = lineQueue.getLast(); // 맨 뒤에 있는 학생 번호
            } else if (currentCount == maxCount) {
                if (!lineQueue.isEmpty() && lineQueue.getLast() < bestStudent) {
                    bestStudent = lineQueue.getLast();
                }
            }
        }

        // 출력
        System.out.println(maxCount + " " + bestStudent);
    }
}