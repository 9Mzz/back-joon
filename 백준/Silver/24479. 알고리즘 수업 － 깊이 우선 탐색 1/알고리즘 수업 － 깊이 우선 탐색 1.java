import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    // 방문 순서 배열
    static int[]     visitOrder;
    // 방문 여부
    static boolean[] visited;
    // 현재 방문 순서
    static int       order = 1;

    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader 설정
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력: 정점의 수 N, 간선의 수 M, 시작 정점 R
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 방문 순서와 방문 여부 배열 초기화
        visitOrder = new int[N + 1];
        visited    = new boolean[N + 1];

        // DFS 시작
        dfs(R, graph);

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(visitOrder[i]);
        }

    }

    static void dfs(int node, List<Integer>[] graph) {
        visited[node] = true;
        // 방문 순서
        visitOrder[node] = order++;

        // 인접 노드 방문
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph);
            }
        }
    }
}
